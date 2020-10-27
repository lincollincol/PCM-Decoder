# PCM-Decoder - decode audio form PCM to MP3
![GitHub release (latest by date)](https://img.shields.io/github/v/release/lincollincol/PCM-Decoder)
![GitHub](https://img.shields.io/github/license/lincollincol/PCM-Decoder)
![GitHub followers](https://img.shields.io/github/followers/lincollincol?style=social)
![GitHub stars](https://img.shields.io/github/stars/lincollincol/PCM-Decoder?style=social)
![GitHub forks](https://img.shields.io/github/forks/lincollincol/PCM-Decoder?style=social)
<p align="center">
  <img src="https://github.com/lincollincol/PCM-Decoder/blob/master/img/pcm_decoder_preview.png">
</p>  

# Example
``` java
PCMDecoder.encodeToMp3(
    "/storage/emulated/0/Music/pcm_file.pcm",     // Input PCM file
    1,                                            // Number of channels
    96000,                                        // Bit rate
    22000,                                        // Sample rate
    "/storage/emulated/0/Music/decoded_audio.mp3" // Output MP3 file
);
```

# Download
## Gradle
``` groovy
allprojects {
  repositories {
    maven { url 'https://jitpack.io' }
  }
}
```
``` groovy
dependencies {
  implementation 'com.github.lincollincol:PCM-Decoder:1.0'
}
```

## Maven
``` xml
<repositories>
  <repository>
    <id>jitpack.io</id>
    <url>https://jitpack.io</url>
  </repository>
</repositories>
```
``` xml
<dependency>
  <groupId>com.github.lincollincol</groupId>
  <artifactId>PCM-Decoder</artifactId>
  <version>1.0</version>
</dependency>
```
## WARNING
### PCM-Decoder process audio in the main thread !  You can run PCM-Decoder with RxJava, Kotlin coroutines and Java Threads to process audio in the background therad.
PCM-Decoder don't process audio in the background thread because of :
* You can use your own approach to work in the background thread. It makes PCM-Decoder library more flexible.
* Reduce library size. Third-party library uses a lot of space and PCM-Decoder delegates this task to user.

## Feedback
<a href="https://mail.google.com">linc.apps.sup@gmail.com</a>

# License
```
   Copyright 2020 lincollincol

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
```
