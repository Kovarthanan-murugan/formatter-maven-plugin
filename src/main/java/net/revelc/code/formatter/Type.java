/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.revelc.code.formatter;

/**
 * Supported types to be formatted.
 */
public enum Type {

    /** The java. */
    JAVA("Java"),
    /** The javascript. */
    JAVASCRIPT("JavaScript"),
    /** The html. */
    HTML("HTML"),
    /** The xml. */
    XML("XML"),
    /** The json. */
    JSON("JSON"),
    /** The css. */
    CSS("CSS");

    /** The name. */
    private String name;

    /**
     * Instantiates a new type.
     *
     * @param name
     *            the name
     */
    Type(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

}
