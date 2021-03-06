/*-
 * Copyright 2013  Séven Le Mesle
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */
package fr.xebia.extras.selma;

/**
 * Created by slemesle on 27/03/15.
 */
public enum IoC {
    /** Adds no annotation for IoC */
    NO,
    /** Adds @Service annotation to the generated mapper */
    SPRING,
    /** Adds @Named annotation to the generated mapper */
    CDI,
    /** Adds @Named and @Singleton annotations to the generated mapper */
    CDI_SINGLETON,
    /** Adds @ApplicationScoped annotation to the generated mapper */
    CDI_APPLICATION_SCOPED
}
