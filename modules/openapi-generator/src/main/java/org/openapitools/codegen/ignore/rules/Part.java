/*
 * Copyright 2018 OpenAPI-Generator Contributors (https://openapi-generator.tech)
 * Copyright 2018 SmartBear Software
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.openapitools.codegen.ignore.rules;

import lombok.Getter;

@Getter
class Part {
    private final IgnoreLineParser.Token token;
    private final String value;

    public Part(IgnoreLineParser.Token token, String value) {
        this.token = token;
        this.value = value;
    }

    public Part(IgnoreLineParser.Token token) {
        this.token = token;
        this.value = token.getPattern();
    }

}