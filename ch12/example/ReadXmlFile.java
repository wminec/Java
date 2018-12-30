package ch12.example;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;
public class ReadXmlFile {

	public static void main(String[] args) {
		try{
			File fXmlFile=new File("company1.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fXmlFile);
			doc.getDocumentElement().normalize();
			
			System.out.println("Root element :"+ doc.getDocumentElement().getNodeName());
			NodeList nList = doc.getElementsByTagName("emp");
			System.out.println("----------------------");
			
			for(int temp=0; temp<nList.getLength(); temp++){
				Node nNode = nList.item(temp);
				if(nNode.getNodeType()==Node.ELEMENT_NODE){
					Element eElement = (Element)nNode;
					System.out.println("First Name : " + getTagValue("firstname",eElement));
					System.out.println("Last Name : " + getTagValue("lastname",eElement));
					System.out.println("Nick Name : " + getTagValue("nickname",eElement));
					System.out.println("Salary : " + getTagValue("salary",eElement));
					System.out.println();
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	private static String getTagValue(String sTag, Element eElement){
		NodeList nList=eElement.getElementsByTagName(sTag).item(0).getChildNodes();
		Node nValue = (Node) nList.item(0);
		return nValue.getNodeValue();
	}
}
