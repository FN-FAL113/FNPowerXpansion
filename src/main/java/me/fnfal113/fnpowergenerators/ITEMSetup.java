package me.fnfal113.fnpowergenerators;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import me.fnfal113.fnpowergenerators.Generators.PowerGens;

final class ITEMSetup {
    static final ITEMSetup INSTANCE = new ITEMSetup();
    private final SlimefunAddon plugin = FNPowerGenerators.getInstance();
    private boolean initialised;

    private ITEMSetup() {}

    public void init() {
        if (initialised) {
            return;
        }

        initialised = true;

        registerPowerGens();
    }

    private void registerPowerGens() {
        new PowerGens(PowerGens.Type.RANK1).register(plugin);
        new PowerGens(PowerGens.Type.RANK2).register(plugin);
        new PowerGens(PowerGens.Type.RANK3).register(plugin);
        new PowerGens(PowerGens.Type.RANK4).register(plugin);
        new PowerGens(PowerGens.Type.RANK5).register(plugin);
        new PowerGens(PowerGens.Type.RANK6).register(plugin);
        new PowerGens(PowerGens.Type.RANK7).register(plugin);
        new PowerGens(PowerGens.Type.RANK8).register(plugin);
        new PowerGens(PowerGens.Type.RANK9).register(plugin);
        new PowerGens(PowerGens.Type.RANK10).register(plugin);
        new PowerGens(PowerGens.Type.RANK11).register(plugin);
        new PowerGens(PowerGens.Type.RANK12).register(plugin);
    }


}
