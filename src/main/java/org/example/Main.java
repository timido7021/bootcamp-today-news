package org.example;

import org.jsoup.nodes.Document;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main {
    public static void main(String[] args) throws Exception {
        Document document = Jsoup.connect("https://news.naver.com/main/main.naver?mode=LSD&mid=shm&sid1=105").get();
        Elements elements = document.select(".sh_text_headline");
        for (Element element : elements)
            System.out.println(element.text());
    }
}