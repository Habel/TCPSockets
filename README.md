#TCPSockets plugin for Phonegap#

This plugin allows you to send messages by TCP from javascript in android.

A simple use would be:
- Send data to an external server to log info for improvement purposes
- Receive data from an external server that can't be held on the device

This plugin returns a message sent by an external tcp server when called.

## Adding the Plugin to your project ##

Using this plugin requires [Android Phonegap](http://github.com/phonegap/phonegap-android).

1. To install the plugin, move TCPSocket.js to your projects assets/www/ folder and include a reference to it in index.html
    
    &lt;script type="text/javascript" charset="utf-8" src="TCPSocket.js"&gt;&lt;/script&gt;

2. Create a direct within your project called "src/com/habel/sockets/" and move TCPSocket.java into it.

3. In your res/xml/plugins.xml file add the following line:
    
    &lt;plugin name="TCPSocket" value="com.habel.sockets.TCPSocket"/&gt;

## Using the plugin ##

This plugin creates the object `window.plugins.TCPSocket`. There is only one method given:

<pre>
  /**
  * Send a message to an external tcp server
  * 
  * @param port    The port that the server is listening on
  * @param host    The IP adress of the server
  * @param message The message you want to send to the server
  * @param success The function that will call if the message is sent and received successfully.
  * @param failure The function that will call if the message is not sen and received successfully.
  */
  send(port, host, message, success, failure)
</pre>

Sample use:
    
    window.plugins.TCPSocket.send(8888, "localhost", "Hello", 
    function (message) { console.log(message); },
    function (message) { console.log(message); }
    );

## RELEASE NOTES ##

### March 31, 2012 ###

* Initial release


## LICENSE ##

PhoneGap is available under *either* the terms of the modified BSD license *or* the
MIT License (2008). As a recipient of PhonegGap, you may choose which
license to receive this code under (except as noted in per-module LICENSE
files). Some modules may not be the copyright of Nitobi.   These
modules contain explicit declarations of copyright in both the LICENSE files in
the directories in which they reside and in the code itself. No external
contributions are allowed under licenses which are fundamentally incompatible
with the MIT or BSD licenses that PhoneGap is distributed under.

The text of the MIT and BSD licenses is reproduced below. 

---

### The "New" BSD License

Copyright (c) 2005-2011, Nitobi Software Inc.
All rights reserved.

Redistribution and use in source and binary forms, with or without
modification, are permitted provided that the following conditions are met:

  * Redistributions of source code must retain the above copyright notice, this
    list of conditions and the following disclaimer.
  * Redistributions in binary form must reproduce the above copyright notice,
    this list of conditions and the following disclaimer in the documentation
    and/or other materials provided with the distribution.
  * Neither the name of Phonegap/Nitobi nor the names of its contributors
    may be used to endorse or promote products derived from this software
    without specific prior written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE
FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.

---

### The MIT License

Copyright (c) <2011> <Nitobi Software Inc., et. al., >

 Permission is hereby granted, free of charge, to any person obtaining a copy
 of this software and associated documentation files (the "Software"), to deal
 in the Software without restriction, including without limitation the rights
 to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 copies of the Software, and to permit persons to whom the Software is
 furnished to do so, subject to the following conditions:

 The above copyright notice and this permission notice shall be included in
 all copies or substantial portions of the Software.

 THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 THE SOFTWARE.
 
