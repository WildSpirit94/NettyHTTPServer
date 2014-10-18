package com.dmitriytkachenko.nettyhttpserver;

public class HtmlCreator {
    private StringBuilder html = new StringBuilder();

    public HtmlCreator() {
        html.append("<!DOCTYPE html>");
        html.append("<head>");
        html.append("<meta charset=\"utf-8\">");
    }

    public void setTitle(String title) {
        html.append("<title>" + title + "</title>");
    }

    public void setH1(String heading) {
        html.append("</head>");
        html.append("<body>");
        html.append("<h1>" + heading + "</h1>");
    }

    public void addParagraph(String paragraph) {
        html.append("<p>" + paragraph + "</p>");
    }

    public String getHtml() {
        html.append("</body>");
        return html.toString();
    }
}
