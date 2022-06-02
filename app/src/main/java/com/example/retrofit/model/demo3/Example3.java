package com.example.retrofit.model.demo3;

public class Example3 {

private Language language;

public Language getLanguage() {
return language;
}

public void setLanguage(Language language) {
this.language = language;
}

    @Override
    public String toString() {
        return "Example{" +
                "language=" + language +
                '}';
    }
}