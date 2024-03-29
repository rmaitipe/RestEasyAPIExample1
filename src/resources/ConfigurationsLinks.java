package resources;

import java.util.List;

import javax.ws.rs.core.Link;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
 
@XmlRootElement(name = "configurations")
@XmlAccessorType(XmlAccessType.FIELD)
public class ConfigurationsLinks
{
    @XmlAttribute
    private Integer size;
     
    @XmlJavaTypeAdapter(Link.JaxbAdapter.class)
    @XmlElement
    private Link link;
     
    @XmlElement
    private List<Configuration> configurationsList;
 
    public Integer getSize() {
        return size;
    }
 
    public void setSize(Integer size) {
        this.size = size;
    }
 
    public Link getLink() {
        return link;
    }
 
    public void setLink(Link link) {
        this.link = link;
    }
 
    public List<Configuration> getConfigurationsList() {
        return configurationsList;
    }
 
    public void setConfigurationsList(List<Configuration> configurations) {
        this.configurationsList = configurations;
    }
}