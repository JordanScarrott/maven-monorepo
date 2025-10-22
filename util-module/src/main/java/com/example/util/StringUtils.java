package com.example.util;

public final class StringUtils {

    private StringUtils() {
        // Prevent instantiation
    }

    /**
     * Checks if a string is null or empty.
     *
     * @param str the string to check
     * @return true if the string is null or empty, false otherwise
     */
    public static boolean isBlank(String str) {
        return str == null || str.trim().isEmpty();
    }
}
