
<h3 align="center">Bot vk server</h3>

<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#installation">Installation</a></li>
      </ul>
    </li>
  </ol>
</details>



<!-- ABOUT THE PROJECT -->
## About The Project

The project was implemented as a test task. For more information, see the link https://docs.google.com/document/d/13CSIpv5CA2_VeX7ltIoHDCqiz8V25neotygzVQkvziA/edit?usp=sharing
You can see an example of how the bot works in the community: https://vk.com/club208098946

<p align="right">(<a href="#top">back to top</a>)</p>


### Built With

To start the project, you need

* [JDK 11](https://www.oracle.com/technetwork/java/javase/downloads/jdk11-downloads-5066655.html)
* [Maven 3.8.3](https://maven.apache.org/download.cgi#downloading-apache-maven-3-8-3)


<p align="right">(<a href="#top">back to top</a>)</p>



<!-- GETTING STARTED -->
## Getting Started

### Installation

1. Clone the repo
   ```sh
   git clone https://github.com/ElenaMatveenko/bot-vk-server.git
   ```
2. Setup ssl proprieties:
   - Open `src/main/resources/application.properties`
   - Specify ssl certificate parameters:
     - **server.ssl.key-store** The path to the keystore containing the certificate
     - **server.ssl.keyStoreType** The format used for the keystore. It could be set to JKS in case it is a JKS file
     - **server.ssl.keyAlias** The alias mapped to the certificate
     - **server.ssl.key-store-password** The password used to generate the certificate
     
3. Setup bot proprieties:
    - Open `src/main/resources/bot.properties`
    - Specify bot parameters:
        - **bot.vk.version** The version of vk api
        - **bot.vk.secret** The secret key that the vk api will transmit in each message
        - **bot.vk.token** The key generated in the vk community. Required message access rights
        - **bot.vk.confirmation** The string that the server must return to confirm the address
4. Build jar
   ```sh
   mvn clean package install
   ```

5. Run application
   ```sh
   java -jar target/bot-vk-server-1.0.jar
   ```

<p align="right">(<a href="#top">back to top</a>)</p>


