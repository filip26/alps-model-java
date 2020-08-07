/*
 * Copyright 2020 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.apicatalog.alps.error;

public final class MalformedDocumentException extends DocumentException {
    
    private static final long serialVersionUID = -4042494993712747461L;

    private final int columnNumber;
    private final int lineNumber;
    
    public MalformedDocumentException(int lineNumber, int columnNumber, String message) {
        super(message);
        this.columnNumber = columnNumber;
        this.lineNumber = lineNumber;
    }
    
    public MalformedDocumentException(int lineNumber, int columnNumber, Throwable cause) {
        super(cause);
        this.columnNumber = columnNumber;
        this.lineNumber = lineNumber;
    }    

    
    public int getColumnNumber() {
        return columnNumber;
    }
    
    public int getLineNumber() {
        return lineNumber;
    }
}