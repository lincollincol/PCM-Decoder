package linc.com.pcmdecoder;

public class PCMDecoder {

    static {
        System.loadLibrary("Mp3Codec");
    }

    public static void encodeToMp3(String pcmFilePath,
                                   int audioChannels,
                                   int bitRate,
                                   int sampleRate,
                                   String mp3FilePath) {
        init(pcmFilePath, audioChannels, bitRate, sampleRate, mp3FilePath);
        encode();
        destroy();
    }

    static native int init(String pcmFilePath,
                           int audioChannels,
                           int bitRate,
                           int sampleRate,
                           String mp3FilePath);

    static native void encode();

    static native void destroy();


}
