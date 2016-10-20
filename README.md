# Karbala WMS server links
### for using WMS server please use one of this method.
##Gradle

Add it in your root build.gradle at the end of repositories:
```gradle
allprojects {
		repositories {
			...
			maven { url "https://jitpack.io" }
	}
}
```



  
Add the dependency:
```gradle
dependencies {
	        compile 'com.github.karbalanajaf:karbalawms:v1.0'
}
```

##Maven
```xml
<repositories>
  <repository>
      <id>jitpack.io</id>
      <url>https://jitpack.io</url>
  </repository>
</repositories>
<dependency>
    <groupId>com.github.karbalanajaf</groupId>
    <artifactId>karbalawms</artifactId>
    <version>v1.0</version>
</dependency>
```
