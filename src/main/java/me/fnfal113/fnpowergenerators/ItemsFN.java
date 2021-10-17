package me.fnfal113.fnpowergenerators;

import dev.j3fftw.litexpansion.extrautils.utils.LoreBuilderDynamic;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.libraries.dough.skins.PlayerHead;
import io.github.thebusybiscuit.slimefun4.libraries.dough.skins.PlayerSkin;
import me.fnfal113.fnpowergenerators.Generators.PowerGens;
import org.bukkit.NamespacedKey;

public final class ItemsFN {
    public static final ItemGroup FNPOWERGENERATORS = new ItemGroup(
            new NamespacedKey(FNPowerGenerators.getInstance(),
                    "fn-power-xpansion"
            ),
            new CustomItemStack(PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "56a7d2195ff7674bbb12e2f7578a2a63c54a980e64744450ac6656e05a790499")),
                    "&eFN_FAL113's &bPower &cXpansion"
            )
    );

    public static final SlimefunItemStack FN_XPANSION_POWER_R1 = new SlimefunItemStack(
            "FN_POWER_XPANSION_POWER_R1",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "33165e254de7863459343543f933481f0dcf8d4730a23433b9a7ff0d3ff79c5a")),
            "&d&lFN Power Xpansion R1",
            "&9This works at Night!",
            "",
            LoreBuilderDynamic.powerBuffer(PowerGens.FN_POWERGEN_RANK_I_STORAGE),
            LoreBuilderDynamic.powerPerTick(PowerGens.FN_POWERGEN_RANK_I_DAYRATE) + " (Day Rate)",
            LoreBuilderDynamic.powerPerTick(PowerGens.FN_POWERGEN_RANK_I_NIGHTRATE) + " (Night Rate)"
    );

    public static final SlimefunItemStack FN_XPANSION_POWER_R2 = new SlimefunItemStack(
            "FN_POWER_XPANSION_POWER_R2",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "5b78e55e3ea6b3682bd7cead43eb1c91b2527a81aa2894f095801f6ee47a3")),
            "&d&lFN Power Xpansion R2",
            "&9This works at Night!",
            "",
            LoreBuilderDynamic.powerBuffer(PowerGens.FN_POWERGEN_RANK_II_STORAGE),
            LoreBuilderDynamic.powerPerTick(PowerGens.FN_POWERGEN_RANK_II_DAYRATE) + " (Day Rate)",
            LoreBuilderDynamic.powerPerTick(PowerGens.FN_POWERGEN_RANK_II_NIGHTRATE) + " (Night Rate)"
    );

    public static final SlimefunItemStack FN_XPANSION_POWER_R3 = new SlimefunItemStack(
            "FN_POWER_XPANSION_POWER_R3",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "45ff60d863d1cf76742f275e2ac5749dd0a978a231d3c51e816132c75aef608a")),
            "&d&lFN Power Xpansion R3",
            "&9This works at Night!",
            "",
            LoreBuilderDynamic.powerBuffer(PowerGens.FN_POWERGEN_RANK_III_STORAGE),
            LoreBuilderDynamic.powerPerTick(PowerGens.FN_POWERGEN_RANK_III_DAYRATE) + " (Day Rate)",
            LoreBuilderDynamic.powerPerTick(PowerGens.FN_POWERGEN_RANK_III_NIGHTRATE) + " (Night Rate)"
    );

    public static final SlimefunItemStack FN_XPANSION_POWER_R4 = new SlimefunItemStack(
            "FN_POWER_XPANSION_POWER_R4",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "efc05af0e88c6fb10b4c8c8b81b7aa658e64649724cb73bb9bb0f25f28bd")),
            "&d&lFN Power Xpansion R4",
            "&9This works at Night!",
            "",
            LoreBuilderDynamic.powerBuffer(PowerGens.FN_POWERGEN_RANK_IV_STORAGE),
            LoreBuilderDynamic.powerPerTick(PowerGens.FN_POWERGEN_RANK_IV_DAYRATE) + " (Day Rate)",
            LoreBuilderDynamic.powerPerTick(PowerGens.FN_POWERGEN_RANK_IV_NIGHTRATE) + " (Night Rate)"
    );

    public static final SlimefunItemStack FN_XPANSION_POWER_R5 = new SlimefunItemStack(
            "FN_POWER_XPANSION_POWER_R5",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "8f14f3179b86f69b3efa7472dacaeb2339f6290d2d817362793348abd98e021")),
            "&d&lFN Power Xpansion R5",
            "&9This works at Night!",
            "",
            LoreBuilderDynamic.powerBuffer(PowerGens.FN_POWERGEN_RANK_V_STORAGE),
            LoreBuilderDynamic.powerPerTick(PowerGens.FN_POWERGEN_RANK_V_DAYRATE) + " (Day Rate)",
            LoreBuilderDynamic.powerPerTick(PowerGens.FN_POWERGEN_RANK_V_NIGHTRATE) + " (Night Rate)"
    );

    public static final SlimefunItemStack FN_XPANSION_POWER_R6 = new SlimefunItemStack(
            "FN_POWER_XPANSION_POWER_R6",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "1d5a09884cb83ef5c908dddd385f246fefdee221712c010177f54376da238fdd")),
            "&d&lFN Power Xpansion R6",
            "&9This works at Night!",
            "",
            LoreBuilderDynamic.powerBuffer(PowerGens.FN_POWERGEN_RANK_VI_STORAGE),
            LoreBuilderDynamic.powerPerTick(PowerGens.FN_POWERGEN_RANK_VI_DAYRATE) + " (Day Rate)",
            LoreBuilderDynamic.powerPerTick(PowerGens.FN_POWERGEN_RANK_VI_NIGHTRATE) + " (Night Rate)"
    );

    public static final SlimefunItemStack FN_XPANSION_POWER_R7 = new SlimefunItemStack(
            "FN_POWER_XPANSION_POWER_R7",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "1d5a09884cb83ef5c908dddd385f246fefdee221712c010177f54376da238fdd")),
            "&d&lFN Power Xpansion R7",
            "&9This works at Night!",
            "",
            LoreBuilderDynamic.powerBuffer(PowerGens.FN_POWERGEN_RANK_VII_STORAGE),
            LoreBuilderDynamic.powerPerTick(PowerGens.FN_POWERGEN_RANK_VII_DAYRATE) + " (Day Rate)",
            LoreBuilderDynamic.powerPerTick(PowerGens.FN_POWERGEN_RANK_VII_NIGHTRATE) + " (Night Rate)"
    );

    public static final SlimefunItemStack FN_XPANSION_POWER_R8 = new SlimefunItemStack(
            "FN_POWER_XPANSION_POWER_R8",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "7ab4c4d6ee69bc24bba2b8faf67b9f704a06b01aa93f3efa6aef7a9696c4feef")),
            "&d&lFN Power Xpansion R8",
            "&9This works at Night!",
            "",
            LoreBuilderDynamic.powerBuffer(PowerGens.FN_POWERGEN_RANK_VIII_STORAGE),
            LoreBuilderDynamic.powerPerTick(PowerGens.FN_POWERGEN_RANK_VIII_DAYRATE) + " (Day Rate)",
            LoreBuilderDynamic.powerPerTick(PowerGens.FN_POWERGEN_RANK_VIII_NIGHTRATE) + " (Night Rate)"
    );

    public static final SlimefunItemStack FN_XPANSION_POWER_R9 = new SlimefunItemStack(
            "FN_POWER_XPANSION_POWER_R9",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "6db32b15d7f32704ed626fa52d06fb2b4071d336fdbfe61e6e41c669d6e37f47")),
            "&d&lFN Power Xpansion R9",
            "&9This works at Night!",
            "",
            LoreBuilderDynamic.powerBuffer(PowerGens.FN_POWERGEN_RANK_IX_STORAGE),
            LoreBuilderDynamic.powerPerTick(PowerGens.FN_POWERGEN_RANK_IX_DAYRATE) + " (Day Rate)",
            LoreBuilderDynamic.powerPerTick(PowerGens.FN_POWERGEN_RANK_IX_NIGHTRATE) + " (Night Rate)"
    );

    public static final SlimefunItemStack FN_XPANSION_POWER_R10 = new SlimefunItemStack(
            "FN_POWER_XPANSION_POWER_R10",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "56a7d2195ff7674bbb12e2f7578a2a63c54a980e64744450ac6656e05a790499")),
            "&d&lFN Power Xpansion R10",
            "&9This works at Night!",
            "",
            LoreBuilderDynamic.powerBuffer(PowerGens.FN_POWERGEN_RANK_X_STORAGE),
            LoreBuilderDynamic.powerPerTick(PowerGens.FN_POWERGEN_RANK_X_DAYRATE) + " (Day Rate)",
            LoreBuilderDynamic.powerPerTick(PowerGens.FN_POWERGEN_RANK_X_NIGHTRATE) + " (Night Rate)"
    );

    public static final SlimefunItemStack FN_XPANSION_POWER_R11 = new SlimefunItemStack(
            "FN_POWER_XPANSION_POWER_R11",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "7f9f356f5fe7d1bc92cddfaeba3ee773ac9df1cc4d1c2f8fe5f47013032c551d")),
            "&d&lFN Power Xpansion R11",
            "&9This works at Night!",
            "",
            LoreBuilderDynamic.powerBuffer(PowerGens.FN_POWERGEN_RANK_XI_STORAGE),
            LoreBuilderDynamic.powerPerTick(PowerGens.FN_POWERGEN_RANK_XI_DAYRATE) + " (Day Rate)",
            LoreBuilderDynamic.powerPerTick(PowerGens.FN_POWERGEN_RANK_XI_NIGHTRATE) + " (Night Rate)"
    );

    public static final SlimefunItemStack FN_XPANSION_POWER_R12 = new SlimefunItemStack(
            "FN_POWER_XPANSION_POWER_R12",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "3464874df452c1d717eddd0fb3b848202ad15571245af6fade2ecf514f3c80bb")),
            "&d&lFN Power Xpansion R12",
            "&9This works at Night!",
            "",
            LoreBuilderDynamic.powerBuffer(PowerGens.FN_POWERGEN_RANK_XII_STORAGE),
            LoreBuilderDynamic.powerPerTick(PowerGens.FN_POWERGEN_RANK_XII_DAYRATE) + " (Day Rate)",
            LoreBuilderDynamic.powerPerTick(PowerGens.FN_POWERGEN_RANK_XII_NIGHTRATE) + " (Night Rate)"
    );

    private ItemsFN() {};
}
