# VexctyAPI
In this API litterly theres one thing, the language system,
if you want to set the player a language you do:
        vexcty.getLangManager().setLang(player.getUniqueId(), Lang.); after the period, put the language code of the lanuage
if you want to get a players language, do:
        vexcty.getLangManager().getLang(player.getUniqueId(), Lang.); after the period, put the language code of the lanuage
	<br>
        
add the dependency here:
Maven:
	<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
  	<dependency>
	    <groupId>com.github.somerandomguythatneedshelp</groupId>
	    <artifactId>VexctyAPI</artifactId>
	    <version>1.0</version>
	</dependency>
Gradle:
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
	dependencies {
	        implementation 'com.github.somerandomguythatneedshelp:VexctyAPI:1.0'
	}
