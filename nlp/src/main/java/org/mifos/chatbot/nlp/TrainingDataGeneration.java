/**
 * Copyright 2018 Dingfan Zhao
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package org.mifos.chatbot.nlp;

import lombok.extern.slf4j.Slf4j;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;

@Slf4j
public class TrainingDataGeneration{
	public static void main(String[] args) {
        log.info(System.getProperty("user.dir"));
		dataFileGeneration();
	}

	private static void dataFileGeneration() {
		File fout = new File("nlp/src/main/resources/TrainingDataFinance-3.txt");
		try {
            FileOutputStream fos = new FileOutputStream(fout);
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));

            for(int i = 0 ; i < 20000 ; i++) {
                Random random = new Random();
                String content = generateData(random.nextInt(6), random.nextInt(3), random.nextInt(5));
                bw.write(content);
                bw.newLine();
            }

            bw.close();
        } catch (IOException e) {
		    System.out.println("Cannot write to this file");
        }
	}

    /**
     * This function is to generate mock user input
     * @param firstIdx
     * @param secondIdx
     * @param thirdIdx
     * @return It will returns the training data with respective tags
     *
     * @author Dingfan
     */
	private static String generateData(int firstIdx, int secondIdx, int thirdIdx) {
        String[] verbChoices = {"look", "load", "What is", "write to", "how", "update", "delete"};
        String[] conjChoices = {"my", "the", "the other user's"};
        String[] nounChoices = {"status of loan", "interest", "outstanding principal", "next due day", "due principal"};
        StringBuffer sb = new StringBuffer();
        sb.append(generateVerbTag(verbChoices[firstIdx]));
        sb.append(" ");
        sb.append(generateContextTag(conjChoices[secondIdx]));
        sb.append(generateCategoryTag(nounChoices[thirdIdx]));

        return sb.toString();
    }

    // Here left a question: I noticed that there are approximately two types of actions, read and write.
    // Do we recognize these two actions as one type or two different tags?

    // OpenNLP is used for entity extraction,
    private static String generateVerbTag(String verb) {
	    StringBuffer sb = new StringBuffer();
	    sb.append(" <START:action> ");
	    sb.append(verb);
	    sb.append(" <END>");

	    return sb.toString();
    }

    private static String generateContextTag(String context) {
        StringBuffer sb = new StringBuffer();
        sb.append(" <START:context> ");
        sb.append(context);
        sb.append(" <END>");

        return sb.toString();
    }

    /**
     * For this category issue, it does not need to recognize the day, because it is handled by the Mifos API
     *
     * Updates: Actually we can contain the keyword "day" in the "category" because the date keyword can be detected using the pre-existing
     * model to detect
     *
     * @param category
     * @return
     */
    private static String generateCategoryTag(String category) {
        StringBuffer sb = new StringBuffer();
        sb.append(" <START:category> ");
        sb.append(category);
        sb.append(" <END>");
//        if(sb.indexOf("day") != -1) {
//            sb.insert(sb.indexOf("day"), " <END> <START:date> ");
//        }

        return sb.toString();
    }
}