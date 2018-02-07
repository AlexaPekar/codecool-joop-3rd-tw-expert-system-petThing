package com.codecool;

import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class RuleParser extends XMLParser {

    RuleRepository rRepo;

    public RuleParser(RuleRepository rRepo) {
        this.rRepo = getRuleRepository(rRepo);
    }

    public RuleRepository getRuleRepository(RuleRepository rRepo) {
        return rRepo;
    }

    public void load(String filename) {

        loadXmlDocument(filename, "Rule");

        for (int temp = 0; temp < nList.getLength(); temp++) {
            Node nNode = nList.item(temp);

            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) nNode;

                rRepo.addQuestion(new Question(eElement.getAttribute("id"), eElement.getElementsByTagName("Question").item(0).getTextContent(), new Answer()));

                for (int i = 0; i < eElement.getElementsByTagName("SingleValue").getLength(); i++) {

                    String param = eElement.getElementsByTagName("SingleValue").item(i).getAttributes().item(0).getTextContent();
                    Boolean selectionType = Boolean.valueOf(eElement.getElementsByTagName("SingleValue").item(i).getParentNode().getAttributes().item(0).getTextContent());

                    rRepo.getQuestions().get(temp).getAnswer().addValue(new SingleValue(param, selectionType));

                }
            }
        }
    }
}
