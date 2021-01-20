package _6kyu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Longest_RepetitionTest {
    @Test
    public void exampleTests() {
        assertArrayEquals(new Object[]{"a", 4}, Longest_Repetition.longestRepetition("aaaabb"));
        assertArrayEquals(new Object[]{"a", 4}, Longest_Repetition.longestRepetition("bbbaaabaaaa"));
        assertArrayEquals(new Object[]{"u", 3}, Longest_Repetition.longestRepetition("cbdeuuu900"));
        assertArrayEquals(new Object[]{"b", 5}, Longest_Repetition.longestRepetition("abbbbb"));
        assertArrayEquals(new Object[]{"a", 2}, Longest_Repetition.longestRepetition("aabb"));
        assertArrayEquals(new Object[]{"", 0}, Longest_Repetition.longestRepetition(""));
        assertArrayEquals(new Object[]{"y", 2}, Longest_Repetition.longestRepetition("yym86ltp5o8n841jpzv0svhgktralucofu57qq8uq3a5vu68ay3gmjd2fz4hxf0vn4n7r1mp11l0dy5hvlayq1n65isdx8jo5kb3uz414g2k98tkols47d4qgp8q5cprg6t0hqcut06ya6lvpc3neejy6qde9ni4un2ux5o1lhwjfv8c0xalabje\n" +
                "6gr8q9bf76ezv74c6mk3s3fsizelygxcmh906dzkolgixppnbi1fn7ecygr492ios9mrosfauvp1802asnr2314vue9idl7kait66wjdmso5y8k994cdygxvs96sk1oex2kfwxj2j23qmweewcp5kgyeexy5ulmfl9kozg76sd4mz4b8u2oru52u6s96b3y8fct5bnfetu988w742o2tuuvvhf85z86l7k88k8yw0rzm8khpcitthe6kz85osk9e04fyidc4qe7m9r3hholg9uo05p2is1gz3k0lizcxc8gisedr12elnbrw7cytomkm4boni7btwbpkn0orugm6g7pj6ozaja9dfo10t70nqw85hckz71aohf006i2zw90wvseeq3lfdjry750069hei44o2jm3tbu1jzs0"));
    }
}