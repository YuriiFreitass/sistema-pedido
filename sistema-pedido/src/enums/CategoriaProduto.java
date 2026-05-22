package enums;

public enum CategoriaProduto {
    ELETRONICO("Eletrônico"),
    ALIMENTO("Alimento"),
    ROUPA("Roupa");

    private final String descricao;

    CategoriaProduto(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
