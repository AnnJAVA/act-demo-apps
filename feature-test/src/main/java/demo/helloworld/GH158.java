package demo.helloworld;

/*-
 * #%L
 * actframework Feature Test App
 * %%
 * Copyright (C) 2018 ActFramework
 * %%
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
 * #L%
 */

import org.osgl.mvc.annotation.GetAction;
import org.osgl.util.IO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import static act.controller.Controller.Util.render;

public class GH158 extends GHTest {

    @GetAction("/login")
    public String login() {
        return "login";
    }

    @GetAction("158")
    public final void gh158() throws IOException {
        try (InputStream is = new FileInputStream("pom.xml")) {
            String pom = IO.readContentAsString(is);
            throw render(pom);
        }
    }

}
