package processor.memoryController;

import processor.memoryController.bios.Bios;
import processor.memoryController.rom.Rom;
import processor.memoryController.videoRam.VideoRam;

/**
 * Created by vicboma on 17/10/15.
 */
public class MemoryControllerImpl implements MemoryController {

    private Bios bios;
    private Rom rom;
    private VideoRam videoRam;

    public MemoryControllerImpl(final Bios bios, final Rom rom, final VideoRam videoRam) {
        this.bios = bios;
        this.rom = rom;
        this.videoRam = videoRam;
    }

    public Bios bios() {
        return bios;
    }

    public Rom rom() {
        return rom;
    }

    public VideoRam videoRam() {
        return videoRam;
    }
}
