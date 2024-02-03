import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();

        System.out.println(calc(line));
    }

    public static String calc(String line) {

        String[] strings = line.split(" ");

        if (strings.length == 1 || strings.length == 2) {

            throw new IllegalArgumentException();

        } else if (strings.length > 3) {

            throw new IllegalArgumentException();
        }

        String ch1 = String.format(strings[0]);
        String st = String.format(strings[1]);
        String ch2 = String.format(strings[2]);


        int x = 0;
        int y = 0;
        int z = 0;
        int h = 0;
        int otv;

        if ((ch1.equals("1") || ch1.equals("2") || ch1.equals("3") || ch1.equals("4") || ch1.equals("5") || ch1.equals("6")
                || ch1.equals("7") || ch1.equals("8") || ch1.equals("9") || ch1.equals("10")) && (ch2.equals("I") || ch2.equals("II")
                || ch2.equals("III") || ch2.equals("IV") || ch2.equals("V") || ch2.equals("VI") || ch2.equals("VII")
                || ch2.equals("VIII") || ch2.equals("IX") || ch2.equals("X")) || (ch2.equals("1") || ch2.equals("2")
                || ch2.equals("3") || ch2.equals("4") || ch2.equals("5") || ch2.equals("6") || ch2.equals("7")
                || ch2.equals("8") || ch2.equals("9") || ch2.equals("10")) && (ch1.equals("I") || ch1.equals("II")
                || ch1.equals("III") || ch1.equals("IV") || ch1.equals("V") || ch1.equals("VI") || ch1.equals("VII")
                || ch1.equals("VIII") || ch1.equals("IX") || ch1.equals("X"))) {
            throw new IllegalArgumentException("Введены разные системы счисления");
        } else if ((!ch1.equals("1") && !ch1.equals("2") && !ch1.equals("3") && !ch1.equals("4") && !ch1.equals("5") && !ch1.equals("6")
                && !ch1.equals("7") && !ch1.equals("8") && !ch1.equals("9") && !ch1.equals("10")) && (!ch1.equals("I") && !ch1.equals("II")
                && !ch1.equals("III") && !ch1.equals("IV") && !ch1.equals("V") && !ch1.equals("VI") && !ch1.equals("VII")
                && !ch1.equals("VIII") && !ch1.equals("IX") && !ch1.equals("X")) || (!ch2.equals("I") && !ch2.equals("II")
                && !ch2.equals("III") && !ch2.equals("IV") && !ch2.equals("V") && !ch2.equals("VI") && !ch2.equals("VII")
                && !ch2.equals("VIII") && !ch2.equals("IX") && !ch2.equals("X")) && (!ch2.equals("1") && !ch2.equals("2")
                && !ch2.equals("3") && !ch2.equals("4") && !ch2.equals("5") && !ch2.equals("6") && !ch2.equals("7")
                && !ch2.equals("8") && !ch2.equals("9") && !ch2.equals("10"))) {
            throw new IllegalArgumentException("Введено неверное число (меньше 1 || больше 10 || меньше I || больше X)");
        } else {

            switch (ch1) {

                case "1":
                    x = 1;
                    break;

                case "2":
                    x = 2;
                    break;

                case "3":
                    x = 3;
                    break;

                case "4":
                    x = 4;
                    break;

                case "5":
                    x = 5;
                    break;

                case "6":
                    x = 6;
                    break;

                case "7":
                    x = 7;
                    break;

                case "8":
                    x = 8;
                    break;

                case "9":
                    x = 9;
                    break;

                case "10":
                    x = 10;
                    break;

                case "I":
                    z = 1;
                    break;

                case "II":
                    z = 2;
                    break;

                case "III":
                    z = 3;
                    break;

                case "IV":
                    z = 4;
                    break;

                case "V":
                    z = 5;
                    break;

                case "VI":
                    z = 6;
                    break;

                case "VII":
                    z = 7;
                    break;

                case "VIII":
                    z = 8;
                    break;

                case "IX":
                    z = 9;
                    break;

                case "X":
                    z = 10;
                    break;

                default:

            }

            switch (ch2) {

                case "1":
                    y = 1;
                    break;

                case "2":
                    y = 2;
                    break;

                case "3":
                    y = 3;
                    break;

                case "4":
                    y = 4;
                    break;

                case "5":
                    y = 5;
                    break;

                case "6":
                    y = 6;
                    break;

                case "7":
                    y = 7;
                    break;

                case "8":
                    y = 8;
                    break;

                case "9":
                    y = 9;
                    break;

                case "10":
                    y = 10;
                    break;

                case "I":
                    h = 1;
                    break;

                case "II":
                    h = 2;
                    break;

                case "III":
                    h = 3;
                    break;

                case "IV":
                    h = 4;
                    break;

                case "V":
                    h = 5;
                    break;

                case "VI":
                    h = 6;
                    break;

                case "VII":
                    h = 7;
                    break;

                case "VIII":
                    h = 8;
                    break;

                case "IX":
                    h = 9;
                    break;

                case "X":
                    h = 10;
                    break;

                default:
                    throw new IllegalArgumentException("Ошибка");

            }
            if (x != 0) {
                switch (st) {

                    case "+":
                        otv = x + y;
                        break;
                    case "-":
                        otv = x - y;
                        break;
                    case "*":
                        otv = x * y;
                        break;

                    case "/":
                        otv = x / y;
                        break;

                    default:
                        throw new IllegalArgumentException("Знак неверный");
                }
            } else {
                switch (st) {

                    case "+":
                        otv = z + h;
                        break;

                    case "-":
                        otv = z - h;
                        break;

                    case "*":
                        otv = z * h;
                        break;

                    case "/":
                        otv = z / h;
                        break;
                    default:
                        throw new IllegalArgumentException("Знак неверный");
                }

                switch (otv) {

                    case -9:
                        throw new IllegalArgumentException("Римское число не может быть отрицательным");
                    case -8:
                        throw new IllegalArgumentException("Римское число не может быть отрицательным");
                    case -7:
                        throw new IllegalArgumentException("Римское число не может быть отрицательным");
                    case -6:
                        throw new IllegalArgumentException("Римское число не может быть отрицательным");
                    case -5:
                        throw new IllegalArgumentException("Римское число не может быть отрицательным");
                    case -4:
                        throw new IllegalArgumentException("Римское число не может быть отрицательным");
                    case -3:
                        throw new IllegalArgumentException("Римское число не может быть отрицательным");
                    case -2:
                        throw new IllegalArgumentException("Римское число не может быть отрицательным");
                    case -1:
                        throw new IllegalArgumentException("Римское число не может быть отрицательным");
                    case 0:
                        return "null";
                    case 1:
                        return "I";
                    case 2:
                        return "II";
                    case 3:
                        return "III";
                    case 4:
                        return "IV";
                    case 5:
                        return "V";
                    case 6:
                        return "VI";
                    case 7:
                        return "VII";
                    case 8:
                        return "VIII";
                    case 9:
                        return "IX";
                    case 10:
                        return "X";
                    case 11:
                        return "XI";
                    case 12:
                        return "XII";
                    case 13:
                        return "XIII";
                    case 14:
                        return "XIV";
                    case 15:
                        return "XV";
                    case 16:
                        return "XVI";
                    case 17:
                        return "XVII";
                    case 18:
                        return "XVIII";
                    case 19:
                        return "XIX";
                    case 20:
                        return "XX";
                    case 21:
                        return "XXI";
                    case 24:
                        return "XXIV";
                    case 25:
                        return "XXV";
                    case 27:
                        return "XXVII";
                    case 28:
                        return "XXVIII";
                    case 30:
                        return "XXX";
                    case 32:
                        return "XXXII";
                    case 35:
                        return "XXXV";
                    case 36:
                        return "XXXVI";
                    case 40:
                        return "XL";
                    case 42:
                        return "XLII";
                    case 45:
                        return "XLV";
                    case 48:
                        return "XLVIII";
                    case 49:
                        return "XLIX";
                    case 50:
                        return "L";
                    case 54:
                        return "LIV";
                    case 56:
                        return "LVI";
                    case 60:
                        return "LX";
                    case 63:
                        return "LXIII";
                    case 64:
                        return "LXIV";
                    case 70:
                        return "LXX";
                    case 72:
                        return "LXXII";
                    case 80:
                        return "LXXX";
                    case 81:
                        return "LXXXI";
                    case 90:
                        return "XC";
                    case 100:
                        return "C";

                    default:
                }
            }
        }
        return String.valueOf(otv);
    }
}
