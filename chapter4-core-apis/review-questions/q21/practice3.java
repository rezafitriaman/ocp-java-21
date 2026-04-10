// #### Immutable
// An object cannot be changed after creation
// Instedad of modifying it -> methods return a new object
//
// - java.time package:
// LocalDate
// LocalTime
// LocalDateTime
// ZonedDateTime
// Instant
// Period
// Duration
//
// Example:
// LocalDate date = LocalDate.now();
// date.plusDays(1); // does nothing
//
// - String
//
// Example:
// String s = "hello";
// s.toUpperCase(); // does not change s
//
// - Wrapper Classes
// All primitive wrappers are immutable:
// Boolean
// Chareacter
// Byte
// Short
// Integer
// Long
// Float
// Double
//
// - BigDecimal and BigInteger
// BigDecimal
// BigInteger
//
// Example:
// BigDecimal b = new BigDecimal("10");
// b.add(new BigDecimal("5")); // ignored
//
// ### NOT immutable (common traps)
// StringBuilder
// StringBuffer
// ArraysList
// HasMap
// Date ( old API)// Date (old API)
