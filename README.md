# VexctyAPI
In this API litterly theres one thing, the language system,
<br>
if you want to set the player a language you do:
<br>
        vexcty.getLangManager().setLang(player.getUniqueId(), Lang.); after the period, put the language code of the lanuage
	<br>
if you want to get a players language, do:
<br>
        vexcty.getLangManager().getLang(player.getUniqueId(), Lang.); after the period, put the language code of the lanuage
	<br>
add the dependency here:
<br>
Maven:
<br>
	<repositories>
	<br>
		<repository>
			<br>
		    <id>jitpack.io</id>
			<br>
		    <url>https://jitpack.io</url>
			<br>
		</repository>
	<br>
	</repositories>
	<br>
  	<dependency>
	<br>
	    <groupId>com.github.somerandomguythatneedshelp</groupId>
	<br>
	    <artifactId>VexctyAPI</artifactId>
	<br>
	    <version>1.0</version>
	<br>
	</dependency>
	<br>
Gradle:
<br>
	allprojects {
	<br>
		repositories {
		<br>
			...
			<br>
			maven { url 'https://jitpack.io' }
			<br>
		}
		<br>
	}
	<br>
	dependencies {
	<br>
	        implementation 'com.github.somerandomguythatneedshelp:VexctyAPI:1.0'
		<br>
	}
	<br>
