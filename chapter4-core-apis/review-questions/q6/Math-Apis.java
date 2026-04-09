// ### Finding Minimum and Maximum
// The Math.min() and Math.max() methods compare two values and return one of them.
// Method signatures:
// public static double min(double a, double b) double, double -> double
// public static float min(float a, float b) float, float -> float
// public static long min(long a, long b) long, long -> long
// public static int min(int a, ing b) int, int -> int

// ### Why we need 4 return types voor min() and max() ?
// Its because we we need to accept all the number types: char, byte, short, int, long, float, double.

// ### Type:
// Math.min(int, int): int
// Math.min(long, long): long
// Math.min(float, float): float
// Math.min(double, double): double

// ----
// ### Rounding Numbers
// The Math.round() method gets rid of the decimal portion of the value, choosing the next higher
// number if appropriate. If the fractional part is .5 or highter, we round up.
// Methode signatures:
// public static long round(double num) double -> long
// public static int round(float num) float -> int

// ### Why we need double and float as a return types for round() methode?
// Round will have always an floating-point(.5). So an decimal are always double and float.
// After the round() methode the number would be rounded(no decimal) so it will rounded to int or long.
// it just happend that `int` is the result of `float` and `long` is the result of `double`.

// ### Chat GPT:
// Math.round() takes float or double because they contain floating-point values.
// After rounding, the result becomes a whole number.
// This is done to safely handle the range of values:
// float fits in int, while double may require long.

// ### Type:
// Math.round(double): long
// Math.round(float): int

// ----
// ### Determining the Ceiling and Floor
// The Math.ceil() method takes a double value. If it is a whole number, it returns the same value
// If it has any fractional value, it rounds up to the next whole number.
// By contrast, the Math.floor() method discards any values after the decimal.

// ### Why we need double as a return type?
// It becuase that ceil() and floor() accepts a double as a type. This methode brings up or down an decimal numbers.
// U can bring up and down because the number is an decimal, without it u cannot bring it up or down.
// ceil() will bring an decimal number up(3.14 -> 4.0) so it will return double as type
// floor() will bring an decimal number down(3.14 -> 3.0) so it will return double as type
// But why in Math.round() we need float as well? it can be only have only decimal type like ceil() and floor()?

// ### Chat GPT:
// Math.ceil() and Math.floor() return double because they operate within the floating-point domain.
// They adjust the value up or down but do not convert it to an integer type.
// This preserves precision and avoids overflow issues that could happend if int or long were used

// ### Methode signatures:
// public static double ceil(double num) double -> double
// public static double floor(double num) double -> double

// ### Type:
// Math.ceil(double): double
// Math.floor(double): double

// ----
// ### Calculating Exponents
// The Math.pow() method handles exponents.

// ### Methode signatures:
// public static double pow(double number, double exponent) double, double -> double

// ### Why we need double as return type?
// Math.pow() returns double because the reuslt of exponentiation can be a raction number, an irrational number,
// or a very large value. Using double ensures that all possible results can be represented safely.

// ### Type:
// Math.pow(double, double): double

// ----
// ### Generating Random Number
// The Math.random() method returns a value greater than or equal to 0 and less than 1.

// ### Methode signatures:
// public static double random() _ -> double

// Why we need double as return type?
// Since it is a random number greater than or equal to 0 and less than 1.
// So it is between 0.0 - 0.9. They are an floating-point numbers

// ### Type:
// Math.random(): double

