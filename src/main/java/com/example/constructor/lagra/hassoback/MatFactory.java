package com.example.constructor.lagra.hassoback;

public class MatFactory implements matInterface<matTemplete> {
    // factory är som logik klass som använder sig av den gemenesamma klassen och är mat
    public static final int kebeb = 1;
    public static final int max = 2;

    public matTemplete matFactoryCreate(int matTyp) {
        return switch (matTyp) {
            case kebeb -> new Kebeb("kebeb");
            case max -> new Max("max");
            default -> null;
        };

    }

}
