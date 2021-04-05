@file:Suppress("NAME_SHADOWING")

package arrow.core

import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.contract

@OptIn(ExperimentalContracts::class)
object Nullable {

  @JvmStatic
  inline fun <A, R> zip(a: A?, fn: (A) -> R): R? {
    contract {
      returnsNotNull() implies (a != null)
    }
    return zip(a, Unit) { a, _ -> fn(a) }
  }

  @JvmStatic
  inline fun <A, B, R> zip(a: A?, b: B?, fn: (A, B) -> R): R? {
    contract {
      returnsNotNull() implies (a != null && b != null)
    }
    return zip(a, b, Unit) { a, b, _ -> fn(a, b) }
  }

  @JvmStatic
  inline fun <A, B, C, R> zip(a: A?, b: B?, c: C?, fn: (A, B, C) -> R): R? {
    contract {
      returnsNotNull() implies (a != null && b != null && c != null)
    }
    return zip(a, b, c, Unit) { a, b, c, _ -> fn(a, b, c) }
  }

  @JvmStatic
  inline fun <A, B, C, D, R> zip(a: A?, b: B?, c: C?, d: D?, fn: (A, B, C, D) -> R): R? {
    contract {
      returnsNotNull() implies (a != null && b != null && c != null && d != null)
    }
    return zip(a, b, c, d, Unit) { a, b, c, d, _ -> fn(a, b, c, d) }
  }

  @JvmStatic
  inline fun <A, B, C, D, E, R> zip(a: A?, b: B?, c: C?, d: D?, e: E?, fn: (A, B, C, D, E) -> R): R? {
    contract {
      returnsNotNull() implies (a != null && b != null && c != null && d != null && e != null)
    }
    return zip(a, b, c, d, e, Unit) { a, b, c, d, e, _ -> fn(a, b, c, d, e) }
  }

  @JvmStatic
  inline fun <A, B, C, D, E, F, R> zip(a: A?, b: B?, c: C?, d: D?, e: E?, f: F?, fn: (A, B, C, D, E, F) -> R): R? {
    contract {
      returnsNotNull() implies (a != null && b != null && c != null && d != null && e != null && f != null)
    }
    return zip(a, b, c, d, e, f, Unit) { a, b, c, d, e, f, _ -> fn(a, b, c, d, e, f) }
  }

  @JvmStatic
  inline fun <A, B, C, D, E, F, G, R> zip(a: A?, b: B?, c: C?, d: D?, e: E?, f: F?, g: G?, fn: (A, B, C, D, E, F, G) -> R): R? {
    contract {
      returnsNotNull() implies (a != null && b != null && c != null && d != null && e != null && f != null && g != null)
    }
    return zip(a, b, c, d, e, f, g, Unit) { a, b, c, d, e, f, g, _ -> fn(a, b, c, d, e, f, g) }
  }

  @JvmStatic
  inline fun <A, B, C, D, E, F, G, H, R> zip(a: A?, b: B?, c: C?, d: D?, e: E?, f: F?, g: G?, h: H?, fn: (A, B, C, D, E, F, G, H) -> R): R? {
    contract {
      returnsNotNull() implies (a != null && b != null && c != null && d != null && e != null && f != null && g != null && h != null)
    }
    return zip(a, b, c, d, e, f, g, h, Unit) { a, b, c, d, e, f, g, h, _ -> fn(a, b, c, d, e, f, g, h) }
  }

  @JvmStatic
  inline fun <A, B, C, D, E, F, G, H, I, R> zip(
    a: A?,
    b: B?,
    c: C?,
    d: D?,
    e: E?,
    f: F?,
    g: G?,
    h: H?,
    i: I?,
    fn: (A, B, C, D, E, F, G, H, I) -> R
  ): R? {
    contract {
      returnsNotNull() implies (a != null && b != null && c != null && d != null && e != null && f != null && g != null && h != null && i != null)
    }
    return zip(a, b, c, d, e, f, g, h, i, Unit) { a, b, c, d, e, f, g, h, i, _ -> fn(a, b, c, d, e, f, g, h, i) }
  }

  @JvmStatic
  inline fun <A, B, C, D, E, F, G, H, I, J, R> zip(
    a: A?,
    b: B?,
    c: C?,
    d: D?,
    e: E?,
    f: F?,
    g: G?,
    h: H?,
    i: I?,
    j: J?,
    fn: (A, B, C, D, E, F, G, H, I, J) -> R
  ): R? {
    contract {
      returnsNotNull() implies (a != null && b != null && c != null && d != null && e != null && f != null && g != null && h != null && i != null && j != null)
    }
    return a?.let { a ->
      b?.let { b ->
        c?.let { c ->
          d?.let { d ->
            e?.let { e ->
              f?.let { f ->
                g?.let { g ->
                  h?.let { h ->
                    i?.let { i ->
                      j?.let { j ->
                        fn(a, b, c, d, e, f, g, h, i, j)
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
}
