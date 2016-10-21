# Karbala WMS server links
### for using WMS server please use one of this method.
##1-Gradle

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
	        compile 'com.github.karbalanajaf:karbalawms:v1.1'
}
```

##2-Maven
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
##Access To WMS Servers
```java
import com.github.karbalawms.ConfigMap;

ConfigMap.MAP_SERVER
ConfigMap.GET_CAPABILITIES
ConfigMap.GET_MAP
ConfigMap.GET_FEATURE_INFO

```


##Get Query For Loading Data From Server
```java
import com.github.karbalawms.ResponsePOJO;
import com.github.karbalawms.RetrofitService;
import com.github.karbalawms.ServiceUtility;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
....

private void loadData(String query) {
	RetrofitService retrofitServices = ServiceUtility.getRetrofit().create(RetrofitService.class);
	Call<List<ResponsePOJO>> call = retrofitServices.getResponsesService(query);
	call.enqueue(new Callback<List<ResponsePOJO>>() {
	    @Override
	    public void onResponse(Call<List<ResponsePOJO>> call, Response<List<ResponsePOJO>> response) {
		List<ResponsePOJO> responsePOJOList = response.body();
		Toast.makeText(MainActivity.this, "number of result: " + responsePOJOList.size(), Toast.LENGTH_LONG).show();
		
	    }

	    @Override
	    public void onFailure(Call<List<ResponsePOJO>> call, Throwable t) {
		
	    }
	});
}
```
