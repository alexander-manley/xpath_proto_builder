/*
Copyright 2014 Yahoo! Inc.
Copyrights licensed under the BSD License. See the accompanying LICENSE file for terms.
*/

package com.yahoo.xpathproto.dataobject;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Config {

    @JsonProperty("definitions")
    private Map<String, Definition> definitions;

    public Map<String, Definition> getDefinitions() {
        return definitions;
    }

    public static class Definition {

        private String proto;
        private List<Entry> transforms;

        public String getProto() {
            return proto;
        }

        public void setProto(final String proto) {
            this.proto = proto;
        }

        public List<Entry> getTransforms() {
            return transforms;
        }

        public void setTransforms(final List<Entry> transforms) {
            this.transforms = transforms;
        }
    }

    public static class Entry {

        private String field;
        private String variable;
        private String path;
        private String handler;
        private String definition;
        private Integer limit;

        public String getField() {
            return field;
        }

        public void setField(final String field) {
            this.field = field;
        }

        public String getVariable() {
            return variable;
        }

        public void setVariable(final String variable) {
            this.variable = variable;
        }

        public String getPath() {
            return path;
        }

        public void setPath(final String path) {
            this.path = path;
        }

        public String getHandler() {
            return handler;
        }

        public void setHandler(final String handler) {
            this.handler = handler;
        }

        public String getDefinition() {
            return definition;
        }

        public void setDefinition(final String definition) {
            this.definition = definition;
        }

        public Integer getLimit() {
            return limit;
        }

        public void setLimit(final Integer limit) {
            this.limit = limit;
        }

    }
}
