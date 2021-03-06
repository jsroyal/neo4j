package org.intermine.neo4j.metadata;

import java.util.HashSet;
import java.util.Set;

/**
 * Describes a RelType node of the Neo4j metagraph.
 *
 * <p>For more information on Metagraph, visit https://github.com/intermine/neo4j/wiki/Metadata.</p>
 *
 * @author Yash Sharma
 */
public class RelTypeDescriptor {

    private String type;
    private Set<String> properties;

    public RelTypeDescriptor(String type, Set<String> properties) {
        this.type = type;
        this.properties = properties;
    }

    public RelTypeDescriptor() {
        this.type = null;
        this.properties = new HashSet<>();
    }

    @Override
    public String toString() {
        return "RelTypeDescriptor{" +
        "type='" + type + '\'' +
        ", properties=" + properties +
        '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Set<String> getProperties() {
        return properties;
    }

    public void setProperties(Set<String> properties) {
        this.properties = properties;
    }

    public void addProperty(String property){
        this.properties.add(property);
    }

    public void removeProperty(String property){
        this.properties.remove(property);
    }

    public boolean hasType(String type){
        return type.equals(this.type);
    }

    public boolean hasProperty(String property){
        return properties.contains(property);
    }

}
