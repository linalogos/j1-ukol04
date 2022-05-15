package cz.czechitas.ukol4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Třída pro losování Sportky.
 */
public class Sportka {
  private List<Integer> osudi = new ArrayList<>();

  public Sportka() {
    int zacatek = 1;
    int konec = 49;
    osudi = IntStream.rangeClosed(zacatek, konec)
            .boxed()
            .collect(Collectors.toList());
  }

  /**
   * Zamíchá osudí.
   *
   * @see Collections#shuffle(List)
   */
  public void zamichat() {
    Collections.shuffle(osudi);
  }

  /**
   * Vrátí seznam s 6 vylosovanými čísly.
   *
   * @return Seznam vylosovaných čísel.
   *
   * @see List#subList(int, int)
   */
  public List<Integer> vylosovanaCisla() {
    List<Integer> seznamVylosovanychCisel = new ArrayList<>();
    seznamVylosovanychCisel = osudi.subList(0, 6);
    return seznamVylosovanychCisel;
  }

  /**
   * Vrátí sedmé vylosované číslo (dodatkové číslo)
   *
   * @return Dodatkové číslo.
   */
  public Integer dodatkoveCislo() {
    int sedmeCislo = osudi.get(7);
    return sedmeCislo;
  }
}
