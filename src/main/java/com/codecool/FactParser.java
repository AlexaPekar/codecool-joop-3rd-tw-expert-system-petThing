package com.codecool;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.HashMap;

public class FactParser {

    FactRepository fRepo;

    public FactParser() {

    }


    public FactRepository getFactRepository(FactRepository fRepo){
        return fRepo;
    }

    public HashMap<String,HashMap<String,Boolean>> factsFromXML = new HashMap<>();


    public void load(String filename){

        try {

            File fXmlFile = new File(filename);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);
            doc.getDocumentElement().normalize();

            NodeList nList = doc.getElementsByTagName("Fact");
            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    factsFromXML.put(eElement.getAttribute("id"),new HashMap<String,Boolean>());


                    for(int i=0;i<eElement.getElementsByTagName("Eval").getLength();i++){
                        factsFromXML.get(eElement.getAttribute("id")).put(eElement.getElementsByTagName("Eval").item(i).getAttributes().item(0).getTextContent(),Boolean.getBoolean(eElement.getElementsByTagName("Eval").item(i).getTextContent()));

                    }





                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
