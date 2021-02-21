package com.example.command.editor;

public class Test {
    public static void main(String[] args) {
        HtmlDocument document = new HtmlDocument();
        History history = new History();

        document.setContent("Hello World");
        BoldCommand boldCommand = new BoldCommand(document, history);

        boldCommand.execute();
        System.out.println(document.getContent());

        UndoCommand undo = new UndoCommand(history);

        undo.execute();
        System.out.println(document.getContent());
    }
}
