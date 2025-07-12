package model;

import model.interfaz.ComandoEditor;

public class ComandoCopiar implements ComandoEditor {
    private Editor editor;
    
    public ComandoCopiar(Editor editor) {
        this.editor = editor;
    }
    
    @Override
    public void ejecutar() {
        editor.copiar();
    }
}
