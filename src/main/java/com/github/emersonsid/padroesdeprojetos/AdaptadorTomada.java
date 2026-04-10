package com.github.emersonsid.padroesdeprojetos;

public class AdaptadorTomada implements TomadaTresPinos {
    private TomadaDoisPinos tomadaDoisPinos;

    public AdaptadorTomada(TomadaDoisPinos tomadaDoisPinos) {
        this.tomadaDoisPinos = tomadaDoisPinos;
    }

    @Override
    public void conectarTresPinos() {
        System.out.println("Adaptando...");
        TomadaDoisPinos tomadaDoisPinos1 = this.tomadaDoisPinos;
        tomadaDoisPinos1.ConectarDoisPinos();
    }
}
