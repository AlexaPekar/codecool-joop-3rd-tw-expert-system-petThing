package com.codecool;

import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class RuleParser extends XMLParser {

    RuleRepository rRepo;

    public RuleParser(RuleRepository rRepo) {
        this.rRepo = getRuleRepository();
    }

    public RuleRepository getRuleRepository() {
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
                    rRepo.getQuestions().get(temp).getAnswer().addValue(new SingleValue(eElement.getElementsByTagName("SingleValue").item(i).getAttributes().item(0).getTextContent(), Boolean.valueOf(eElement.getElementsByTagName("SingleValue").item(i).getParentNode().getAttributes().item(0).getTextContent())));
                    
                }

                //fRepo.addFact(new Fact(eElement.getAttribute("id"), eElement.getElementsByTagName("Description").item(0).getAttributes().item(0).getTextContent()));

                //for (int i = 0; i < eElement.getElementsByTagName("Eval").getLength(); i++) {
                //fRepo.getFacts().get(temp).setFactValueById(eElement.getElementsByTagName("Eval").item(i).getAttributes().item(0).getTextContent(), Boolean.valueOf(eElement.getElementsByTagName("Eval").item(i).getTextContent()));

            }
        }
    }
}
