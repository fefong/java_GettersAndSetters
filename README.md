Java Getters and Setters
=========================

Example Application: Getters and Setters


# Variables 

Declare any variable: 

```java
public class Person {
	private String name;
	private String familyName;
	private int age;
}
```

## Getters

Class **[person](src\java_GettersAndSetters\Person.java)** declares getters.

```java
public String getName() {
	return name;
}
	
public String getFamilyName() {
	return familyName;
}
	
public int getAge() {
	return age;
}
```

It is possible to create a custom getter.

```java
public String getFullName() {
	return name + " " + familyName;
}
```


## Setters

Class **[person](src\java_GettersAndSetters\Person.java)** declares setters.

```java
public void setName(String name) {
	this.name = name;
}

public void setAge(int age) {
	this.age = age;
}

public void setFamilyName(String familyName) {
	this.familyName = familyName;
}
```

## Some links for more in depth learning

* [JAVA PRINT](https://github.com/fefong/java_print);
* [JAVA SWITCH CASE](https://github.com/fefong/java_switch);
* [JAVA IF/ELSE](https://github.com/fefong/java_ifElse);
* [JAVA ARITHMETIC](https://github.com/fefong/java_calculator);

* [JAVA](https://github.com/search?q=fefong%2Fjava)

