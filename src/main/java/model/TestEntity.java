/*
 * TestEntity.java
 *
 * created at Dec 7, 2015 by m.dzhigarov <m.dzhigarov@seeburger.com>
 *
 * Copyright (c) SEEBURGER AG, Germany. All Rights Reserved.
 */
package model;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.Link;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Test")
public class TestEntity
{
    @XmlElement(name = "link")
    @XmlJavaTypeAdapter(Link.JaxbAdapter.class)
    List<Link> links = new ArrayList<Link>();

    public void addLink(Link link)
    {
        links.add(link);
    }

    public List<Link> getLinks()
    {
        return links;
    }
}