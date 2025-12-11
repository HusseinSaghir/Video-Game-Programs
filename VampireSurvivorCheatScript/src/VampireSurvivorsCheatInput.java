import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VampireSurvivorsCheatInput {

    public static void main(String[] args) {
        // Use triple quotes (""" """) for multiline string (Java 15+)
        String inputText = """
            Arca Ladonna - "noneladonna"
            Porta Ladonna - "vivaladonna"
            Lama Ladonna - "superladonna"
            Poe Ratcho - "strongestcharacter"
            Suor Clerici - "faschiuma"
            Dommario - "bioparco"
            Krochi Freetto - "accidenti"
            Christine Davain - "crystalmakeup"
            Pugnala Provola - "flymetothemoon"
            Giovanna Grana - "thetwoassassins"
            Poppea Pecorina - "feldschlacht"
            Concetta Caciotta - "ifeellovevenus"
            Yatta Cavallo and Cherry Bomb - "yattapanda"
            Bianca Ramba and Carréllo - "carramba"
            O'Sole Meeo and Celestial Dusting - "reset"
            Sir Ambrojoe and La Robba - "languorino"
            Iguana Gallo Valletto - "waitreaction"
            Divano Thelma - "quandolodicelui"
            Zi'Assunta Belpaese - "paradigmshift"
            Exdash Exiviiq - "x-x1viiq" (also works in main menu) or "exdashexoneviiq"
            Toastie - "tramezzini" (Exdash must be unlocked)
            Smith IV - "maybeimastallion"
            Random - "igottagettotheedgeofsoul"
            Boon Marrabbio - "fettinepanate"
            Avatar Infernas and Flames of Misspell - "kalvasflam"
            Minnah Mannarah - "foldinthecheese"
            Leda - "iwillneverletyouforgetaboutme"
            Cosmo Pavone - "lhovistoio"
            Peppino - "pinociampino"
            Big Trouser - "earrivatolarrotino"
            missingN▯ - "rightninetyseven"
            Gains Boros - "highfive"
            Gyorunton - "secondevolution"
            Mask of the Red Death - "ablasphemousmockery"
            Queen Sigma - "allatonce"
            Rose De Infernas - "rescuefromtheshadows"
            Scorej-Oni - "notsureitsthunder"
            She-Moon Eeta - "cygnusmagnus"
            Bat Robbert - "bimbumbam"
            Space Dude - "thegoodguy"
            Santa Ladonna - "shesawit"
            Gyoruntin - "blunderingfool"
            Bats Bats Bats - "whydithavetobebats"
            Legacy of the Moonspell DLC
            Miang Moonspell and Silver Wind - "shounenheroine"
            Menya Moonspell and Four Seasons - "youngatheart"
            Syuuto Moonspell and Summon Night - "itsnotaneclipse"
            Babi-Onna and Mirage Robe - "vogue"
            McCoy-Oni and 108 Bocce - "ionicoionico"
            Megalo Menya Moonspell - "elamadonna"
            Megalo Syuuto Moonspell and Night Sword - "takeashower"
            Gav'Et-Oni and Mille Bolle Blu - "chevolano"
            Tides of the Foscari DLC
            Eleanor Uziron and SpellString - "spellsomething"
            SpellStream - "spellwhatever"
            SpellStrike - "spellwhichever"
            Maruto Cuts and Eskizzibur - "animeismypassion"
            Keitha Muort and Flash Arrow - "oopsistoleoneagain"
            Luminaire Foscari and Prismatic Missile - "deusexmachina"
            Genevieve Gruyère and Shadow Servant - "basicwitch"
            Je-Ne-Viv - "theworldeater"
            Sammy - "happybirthday"
            Rottin'Ghoul and Party Popper - "souloftheparty"
            Emergency Meeting DLC
            Crewmate Dino - "redissus"
            Engineer Gino - "isaworangevent"
            Ghost Lino - "foundyellowinmedical"
            Shapeshifter Nino - "greenisredyouisme"
            Guardian Pina - "foundblueinstorage"
            Impostor Rina - "youaretheimpostor"
            Scientist Mina - "sciencepink"
            Horse - "haaayimpasta"
            Megalo Impostor Rina "selfreport"
            Operation Guns DLC
            Bill Rizer - "runandrizer"
            Lance Bean - "beanmachinegun"
            Brad Fang - "alwaysarmednevershaved"
            Browny - "metallicbakedgoods"
            Lucia Zero - "amitheoriginal"
            Probotector - "rdooeight"
            Sheena Etranzi - "battlefieldflower"
            Stanley - "morethanamechsuit"
            Ariana - "protectorofgaluga"
            Colonel Bahamut - "badbetrayerbahamut"
            Newt Plissken - "chiefsalamander"
            Simondo Belmont - "honouringmasato"
            Hectic Highway - "hardcorpshighspeed"
            Ode to Castlevania DLC
            Characters
            Leon Belmont - "lamentedgenesis"
            Sonia Belmont - "legendmother"
            Trevor Belmont - "wallchickenenjoyer"
            Christopher Belmont - "firsttodoittwice"
            Simon Belmont - "peterdante"
            Juste Belmont - "fatefulfusion"
            Richter Belmont - "doesnthaveuno"
            Julius Belmont - "omniavanitas"
            Grant Danasty - "actuallyquitenice"
            Quincy Morris - "nonplayercharacter"
            John Morris - "beefbbq"
            Jonathan Morris - "morissson"
            Maxim Kischine - "stellarfan"
            Henry - "silverbullet"
            Soma Cruz - "technicallynotavampire"
            Vlad Tepes Dracula - "notinthisgame"
            Charlotte Aulin - "notachild"
            Sypha Belnades - "bluecipher"
            Julia Laforeze - "botheredbybrother"
            Carrie Fernandez - "polygonalbelnades"
            Yoko Belnades - "notasuccubus"
            Rinaldo Gandolfi - "alchemistslament"
            Mina Hakuba - "enshrinedheart"
            Elizabeth Bartley - "thelizardqueen"
            Alucard - "adrianfahrenheit"
            Reinhardt Schneider - "upstartweakling"
            Eric Lecarde - "lecardigan"
            Isaac - "guiltydevil"
            Hector - "deckbrush"
            Sara Trantoul - "bondedsoul"
            Vincent Dorin - "nofreebies"
            Maria Renard - "holyglasses"
            Shanoa - "morningsun"
            Albus - "bigbrother"
            Lisa Tepes - "mourned"
            Shaft - "vladsbiggestfan"
            Saint Germain - "timeorratherfate"
            Nathan Graves - "cardsharp"
            Cornell - "emeryboard"
            Barlowe - "pitiablemadman"
            Young Maria Renard - "yourfaultforbeingsomean"
            Familiar - "friendlevania"
            Innocent Devil - "forgemasterfriends"
            Blue Crescent Moon Cornell - "azurecroissant"
            Ferryman - "hehhehheh"
            Master Librarian - "rockingchair"
            Hammer - "whatwouldyouspenditon"
            Wind - "nospoilers"
            Charlotte & Jonathan - "jonathancharlotte"
            Jonathan & Charlotte - "etteolrahcnahtanoj"
            Stella Lecarde - "twinnado"
            Loretta Lecarde - "cooltwin"
            Brauner - "everyonesacritic"
            Soleil Belmont - "prodigalson"
            Dario Bossi - "aguniinagony"
            Dmitrii Blinov - "menacinghaircut"
            Celia Fortner - "withlight"
            Graham Jones- "umbraleclipse"
            Joachim Armster - "cantholdthemall"
            Walter Bernhard - "itsallhisfault"
            Carmilla - "weepingmask"
            Count Olrox - "dontdisturbdinner"
            Cave Troll - "chupacabra"
            Fleaman - "finalboss"
            Axe Armor - "missaxalotl"
            Frozenshade - "coldshoulder"
            Succubus - "thatsnotlisa"
            Keremet - "cauldronking"
            Alamaric Sniper - "gothangel"
            Blackmore - "bizarreshadeadventure"
            Malphas - "karasuman"
            Death - "sewardzead"
            Galamoth - "sizematters"
            Megalo Elizabeth Bartley - "petrifyinglyevil"
            Megalo Olrox - "theothercount"
            Megalo Death - "embracethereaper"
            Megalo Dracula - "mathiascronqvist"
            Chaos - "iiiiiiivvviviiviiiixxxixiixiiixivxvxvixviixviiixixxxxxi"
            Relics
            Castlevania Map - "entityofchaos"
            Stallion Gate - "horsedoor"
            Scorpion Gate - "headsortails"
            Capra Gate - "walkintothemirror"
            King's Gate - "kingoftheflies"
            Serpent Gate - "pieceoftime"
            Beast Gate - "beastlybowels"
            Black Disk - "disobeyalucard"
            Wood Carving Score - "readerspartita"
            Pile of Secrets - "isthiswhatamanis"
            Ebony and Crimson Stones - "becomeanvampiyre"
            Weapons
            Alchemy Whip, Wind Whip, Platinum Whip, Dragon Water Whip, Sonic Whip, Jet Black Whip, Vibhuti Whip, Vanitas Whip, and Morning Star - "candlebane"
            Curved Knife, Shuriken, Javelin, Iron Ball, Discus, Silver Revolver, Hand Grenade, Wine Glass, and Coat of Arms - "kitchensink"
            Raging Fire, Ice Fang, Gale Force, Rock Riot, Fulgur, Keremet Bubbles, Hex, Refectio, and Belnades' Spellbook - "belnadesbookworm"
            Alucart Sworb, Tyrfing, Alucard Spear, Trident, Mace, Star Flail, Iron Shield, Guardian's Targe, and Spectral Sword - "wordsthatstartwiths"
            Confodere, Optical Shot, Sonic Dash, Luminatio, Umbra, Globus, Dominus Agony, Centralis Custos, and Ebony Diabologue - "blackrockscroll"
            Endo Gears, Peri Pendulum, Myo Lift, and Epi Head - "greatuseoftime"
            Valmanway, Icebrand, Arrow of Goth, Summon Spirit Tornado, Aura Blast, Svarog Statue, Troll Bomb, Hydro Storm, Grand Cross, Summon Spirit, Dark Rift, Soul Steal, and Sword Brothers - "draculasdungeon"
            Stages
            Mad Forest, Inlaid Library, Dairy Plant, Gallo Tower, and Cappella Magna - "everywhere" (only works after unlocking the achievement that unlocks Inlaid Library)
            Il Molise - "relaxenjoylife"
            Moongolow - "honesty"
            Green Acres - "dotgogreenacres"
            The Bone Zone - "rottingpizza"
            Boss Rash - "peakgamedesign"
            Bat Country - "recycletheforest"
            Astral Stair - "recyclethelibrary"
            Tiny Bridge - "recyclethetower"
            Whiteout - "buriedinthesnow"
            Space 54 - "jumptheshark"
            Laborratory - "divineassault"
            Carlo Cart - "thenextstopis"
            Room 1665 - "forbiddenbox"
            The spell also unlocks their respective hyper mode toggle.

            Weapons and Passive Items
            Weapons and Passive items - "everything" (only for items from level ups, not the secret ones unlocked by Yellow Sign)
            Arma Dio - "apritisedano"
            Relics
            Grim Grimoire - "thisshouldhavebeenunlockedbydefault"
            Ars Gouda - "thistooshouldhavebeenunlockedbydefault"
            Milky Way Map - "leadmetothecheese"
            Magic Banger - "thankelrond"
            Sorceress' Tears - "timecompression"
            Glass Vizard - "eggseggseggs"
            Mindbender - "teleportustomars"
            Yellow Sign - "ihaveseenitihaveseenitihaveseenitihaveseenitihaveseenitihaveseenitihaveseenitihaveseenit"
            Great Gospel - "icanhearthecriesofcaptainplanet"
            Gracia's Mirror - "freezearrow"
            Seventh Trumpet - "dootdoot"
            Atlas Gate - "tolovetoshine"
            Chaos Malachite - "gottagofast"
            Chaos Rosalia - "coldwaterhotwater"
            Chaos Altemanna - "chapatribe"
            Apoplexy - "tengillesbalm"
            Antidote - "duraistruth"
            Trisection - "haeralisploy"
            Brave Story - "lugrianstale"
            Randomazzo and Sarabande of Healing (VI) - "randomazzami"
            Darkasso and Moonlight Bolero (VI) - "darkassami"
            Arcanas
            Game Killer (0) - "ilmatto"
            Gemini (I) - "ilbagatto"
            Twilight Requiem (II) - "lapapessa"
            Tragic Princess (III) - "limperatrice"
            Awake (IV) - "limperatore"
            Chaos in the Dark Night (V) - "ilpapa"
            Sarabande of Healing (VI) - "randomazzami"
            Iron Blue Will (VII) - "ilcarro"
            Mad Groove (VIII) - "laforza"
            Divine Bloodline (IX) - "leremita"
            Beginning (X) - "laruota"
            Waltz of Pearls (XI) - "lagiustizia"
            Out of Bounds (XII) - "lappeso"
            Wicked Season (XIII) - "lamorte"
            Jail of Crystal (XIV) - "latemperanza"
            Disco of Gold (XV) - "ildiavolo"
            Slash (XVI) - "latorre"
            Lost & Found Painting (XVII) - "lastella"
            Boogaloo of Illusions (XVIII) - "laluna"
            Heart of Fire (XIX) - "ilsole"
            Silent Old Sanctuary (XX) - "ilgiudizio"
            Blood Astronomia (XXI) - "ilmondo"
            Darkanas
            Sapphire Mist (I) - "ottagabli"
            Moonlight Bolero (VI) - "darkassami"
            Hail from the Future (X) - "atoural"
            Crystal Cries (XII) - "oseppal"
            Wandering the Jet Black (XXI) - "odnomli"
            Character Skins
            Halloween theming for Mortaccio, Yatta Cavallo, Bianca Ramba, O'Sole Meeo, and their weapons - "spoopyseason"
            Unblinded Imelda Belpaese - "unblindimelda"
            Retired Poe Ratcho - "retirepoe"
            Enable the toggling of Eleanor Uziron's starting weapon to the other "Spell" weapons through the character skin selection - "starpupil"
            """;

        try {
            Robot robot = new Robot();
            
            // Give user time to switch to Vampire Survivors window
            System.out.println("Switch to Vampire Survivors window now...");
            Thread.sleep(5000);
            
            // Extract all cheat codes more reliably
            List<String> cheatCodes = extractCheatCodes(inputText);
            System.out.println("Found " + cheatCodes.size() + " cheat codes to enter");
            
            for (String cheatCode : cheatCodes) {
                System.out.println("Entering cheat: " + cheatCode);
                
                // Type the cheat code
                typeString(robot, cheatCode);
                
                // Press Enter to submit
                robot.keyPress(KeyEvent.VK_ENTER);
                robot.keyRelease(KeyEvent.VK_ENTER);
                
                // 10-second delay between cheats
                Thread.sleep(10000);
            }
            
            System.out.println("All cheats entered!");
        } catch (AWTException | InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    private static List<String> extractCheatCodes(String inputText) {
        List<String> cheatCodes = new ArrayList<>();
        // This pattern looks for text between quotes that isn't preceded by a backslash
        Pattern pattern = Pattern.compile("(?<!\\\\)\"([^\"]*)\"");
        Matcher matcher = pattern.matcher(inputText);
        
        while (matcher.find()) {
            String cheatCode = matcher.group(1);
            // Skip empty codes and the word "Spell" which appears in descriptions
            if (!cheatCode.isEmpty() && !cheatCode.equals("Spell")) {
                cheatCodes.add(cheatCode);
            }
        }
        return cheatCodes;
    }
    
    private static void typeString(Robot robot, String text) {
        for (char c : text.toCharArray()) {
            int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);
            
            if (Character.isUpperCase(c)) {
                robot.keyPress(KeyEvent.VK_SHIFT);
            }
            
            try {
                robot.keyPress(keyCode);
                robot.keyRelease(keyCode);
            } catch (IllegalArgumentException e) {
                // Handle special characters if needed
                System.err.println("Could not type character: " + c);
            }
            
            if (Character.isUpperCase(c)) {
                robot.keyRelease(KeyEvent.VK_SHIFT);
            }
            
            // Small delay between key presses
            robot.delay(50);
        }
    }
}