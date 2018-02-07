package com.codecool;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.HashMap;

public class FactParser extends XMLParser {

    FactRepository fRepo;


    public FactParser(FactRepository fRepo) {
        this.fRepo = getFactRepository(fRepo);
    }


    public FactRepository getFactRepository(FactRepository fRepo) {
        return fRepo;
    }


    public void load(String filename) {

        loadXmlDocument(filename, "Fact");

        for (int temp = 0; temp < nList.getLength(); temp++) {
            Node nNode = nList.item(temp);

            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) nNode;

                fRepo.addFact(new Fact(eElement.getAttribute("id"), eElement.getElementsByTagName("Description").item(0).getAttributes().item(0).getTextContent()));

                for (int i = 0; i < eElement.getElementsByTagName("Eval").getLength(); i++) {
                    fRepo.getFacts().get(temp).setFactValueById(eElement.getElementsByTagName("Eval").item(i).getAttributes().item(0).getTextContent(), Boolean.valueOf(eElement.getElementsByTagName("Eval").item(i).getTextContent()));

                }
            }
        }
    }
}