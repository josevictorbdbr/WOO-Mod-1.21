package josev.woo.sound;

import josev.woo.WorldOfOres;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {

    public static final SoundEvent LF_USE = registerSoundEvent("lf_use");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = Identifier.of(WorldOfOres.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds(){
        WorldOfOres.LOGGER.info("Registering sounds for " + WorldOfOres.MOD_ID);
    }

}
