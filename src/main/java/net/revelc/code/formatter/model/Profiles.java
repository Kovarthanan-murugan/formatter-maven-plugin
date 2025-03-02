/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.revelc.code.formatter.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * A class representing the profiles XML element in the Eclipse formatter config file, including a List of profile
 * setting Maps with id and value.
 */
public class Profiles {

    /** The Constant PROFILE_KIND. */
    public static final String PROFILE_KIND = "CodeFormatterProfile";

    /** The profiles. */
    private final List<Map<String, String>> profileList = new ArrayList<>();

    /**
     * Adds the profile.
     *
     * @param profile
     *            the profile
     */
    public void addProfile(final Profile profile) {
        if (Profiles.PROFILE_KIND.equals(profile.getKind())) {
            this.profileList.add(profile.getSettings());
        }
    }

    /**
     * Gets the profiles.
     *
     * @return the profiles
     */
    public List<Map<String, String>> getProfiles() {
        return this.profileList;
    }
}
