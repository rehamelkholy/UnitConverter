package com.example.android.unitconverter;

public class Converter {
    public Converter() {

    }

    public double areaConvert(double fromNumber, String fromUnit, String toUnit) {
        double initialNumber = fromNumber;
        double finalNumber = 0.0d;

        String from = fromUnit.toLowerCase();
        String to = toUnit.toLowerCase();

        switch (from) {
            case "square kilometre": {
                switch (to) {
                    case "square metre":
                        finalNumber = initialNumber * 1e+6;
                        break;

                    case "square mile":
                        finalNumber = initialNumber * 0.386102d;
                        break;

                    case "square yard":
                        finalNumber = initialNumber * 1.196e+6;
                        break;

                    case "square foot":
                        finalNumber = initialNumber * 1.076e+7;
                        break;

                    case "square inch":
                        finalNumber = initialNumber * 1.55e+9;
                        break;

                    case "hectare":
                        finalNumber = initialNumber * 100.0d;
                        break;

                    case "acre":
                        finalNumber = initialNumber * 247.105d;
                        break;
                }
            }
            break;

            case "square metre": {
                switch (to) {
                    case "square kilometre":
                        finalNumber = initialNumber * 1e-6;
                        break;

                    case "square mile":
                        finalNumber = initialNumber * 3.861e-7;
                        break;

                    case "square yard":
                        finalNumber = initialNumber * 1.19599d;
                        break;

                    case "square foot":
                        finalNumber = initialNumber * 10.7639d;
                        break;

                    case "square inch":
                        finalNumber = initialNumber * 1550.0d;
                        break;

                    case "square hectare":
                        finalNumber = initialNumber * 1e-4;
                        break;

                    case "square acre":
                        finalNumber = initialNumber * 0.000247105d;
                        break;
                }
            }
            break;

            case "square mile": {
                switch (to) {
                    case "square kilometre":
                        finalNumber = initialNumber * 2.58999d;
                        break;

                    case "square metre":
                        finalNumber = initialNumber * 2.59e+6;
                        break;

                    case "square yard":
                        finalNumber = initialNumber * 3.098e+6;
                        break;

                    case "square foot":
                        finalNumber = initialNumber * 2.788e+7;
                        break;

                    case "square inch":
                        finalNumber = initialNumber * 4.014e+9;
                        break;

                    case "square hectare":
                        finalNumber = initialNumber * 258.999d;
                        break;

                    case "square acre":
                        finalNumber = initialNumber * 640.0d;
                        break;
                }
            }
            break;

            case "square yard": {
                switch (to) {
                    case "square kilometre":
                        finalNumber = initialNumber * 8.3613e-7;
                        break;

                    case "square metre":
                        finalNumber = initialNumber * 0.836127d;
                        break;

                    case "square mile":
                        finalNumber = initialNumber * 3.2283e-7;
                        break;

                    case "square foot":
                        finalNumber = initialNumber * 9.0d;
                        break;

                    case "square inch":
                        finalNumber = initialNumber * 1296.0d;
                        break;

                    case "square hectare":
                        finalNumber = initialNumber * 8.3613e-5;
                        break;

                    case "square acre":
                        finalNumber = initialNumber * 0.000206612d;
                        break;
                }
            }
            break;

            case "square foot": {
                switch (to) {
                    case "square kilometre":
                        finalNumber = initialNumber * 9.2903e-8;
                        break;

                    case "square metre":
                        finalNumber = initialNumber * 0.092903d;
                        break;

                    case "square mile":
                        finalNumber = initialNumber * 3.587e-8;
                        break;

                    case "square yard":
                        finalNumber = initialNumber * 0.111111d;
                        break;

                    case "square inch":
                        finalNumber = initialNumber * 144.0d;
                        break;

                    case "square hectare":
                        finalNumber = initialNumber * 9.2903e-6;
                        break;

                    case "square acre":
                        finalNumber = initialNumber * 2.2957e-5;
                        break;
                }
            }
            break;

            case "square inch": {
                switch (to) {
                    case "square kilometre":
                        finalNumber = initialNumber * 6.4516e-10;
                        break;

                    case "square metre":
                        finalNumber = initialNumber * 0.00064516d;
                        break;

                    case "square mile":
                        finalNumber = initialNumber * 2.491e-10;
                        break;

                    case "square yard":
                        finalNumber = initialNumber * 0.000771605d;
                        break;

                    case "square foot":
                        finalNumber = initialNumber * 0.00694444d;
                        break;

                    case "square hectare":
                        finalNumber = initialNumber * 6.4516e-8;
                        break;

                    case "square acre":
                        finalNumber = initialNumber * 1.5942e-7;
                        break;
                }
            }
            break;

            case "square hectare": {
                switch (to) {
                    case "square kilometre":
                        finalNumber = initialNumber * 0.01d;
                        break;

                    case "square metre":
                        finalNumber = initialNumber * 10000.0d;
                        break;

                    case "square mile":
                        finalNumber = initialNumber * 0.00386102d;
                        break;

                    case "square yard":
                        finalNumber = initialNumber * 11959.9d;
                        break;

                    case "square foot":
                        finalNumber = initialNumber * 107639.0d;
                        break;

                    case "square inch":
                        finalNumber = initialNumber * 1.55e+7;
                        break;

                    case "square acre":
                        finalNumber = initialNumber * 2.47105d;
                        break;
                }
            }
            break;

            case "square acre": {
                switch (to) {
                    case "square kilometre":
                        finalNumber = initialNumber * 0.00404686d;
                        break;

                    case "square metre":
                        finalNumber = initialNumber * 4046.86d;
                        break;

                    case "square mile":
                        finalNumber = initialNumber * 0.0015625d;
                        break;

                    case "square yard":
                        finalNumber = initialNumber * 4840.0d;
                        break;

                    case "square foot":
                        finalNumber = initialNumber * 43560.0d;
                        break;

                    case "square inch":
                        finalNumber = initialNumber * 6.273e+6;
                        break;

                    case "square hectare":
                        finalNumber = initialNumber * 0.404686d;
                        break;
                }
            }
            break;
        }

        return finalNumber;
    }

    public double dataTransferRateConvert(double fromNumber, String fromUnit, String toUnit) {
        double initialNumber = fromNumber;
        double finalNumber = 0.0d;

        String from = fromUnit.toLowerCase();
        String to = toUnit.toLowerCase();

        switch (from) {
            case "bit per second": {
                switch (to) {
                    case "kilobit per second":
                        finalNumber = initialNumber * 0.001d;
                        break;

                    case "kilobyte per second":
                        finalNumber = initialNumber * 0.000125d;
                        break;

                    case "kibibit per second":
                        finalNumber = initialNumber * 0.000976563d;
                        break;

                    case "megabit per second":
                        finalNumber = initialNumber * 1e-6;
                        break;

                    case "megabyte per second":
                        finalNumber = initialNumber * 1.25e-7;
                        break;

                    case "mebibit per second":
                        finalNumber = initialNumber * 9.5367e-7;
                        break;

                    case "gigabit per second":
                        finalNumber = initialNumber * 1e-9;
                        break;

                    case "gigabyte per second":
                        finalNumber = initialNumber * 1.25e-10;
                        break;

                    case "gibibit per second":
                        finalNumber = initialNumber * 9.3132e-10;
                        break;

                    case "terabit per second":
                        finalNumber = initialNumber * 1e-12;
                        break;

                    case "terabyte per second":
                        finalNumber = initialNumber * 1.25e-13;
                        break;

                    case "tebibit per second":
                        finalNumber = initialNumber * 9.0949e-13;
                        break;
                }
            }
            break;

            case "kilobit per second": {
                switch (to) {
                    case "bit per second":
                        finalNumber = initialNumber * 1000.0d;
                        break;

                    case "kilobyte per second":
                        finalNumber = initialNumber * 0.125d;
                        break;

                    case "kibibit per second":
                        finalNumber = initialNumber * 0.976563d;
                        break;

                    case "megabit per second":
                        finalNumber = initialNumber * 0.001d;
                        break;

                    case "megabyte per second":
                        finalNumber = initialNumber * 0.000125d;
                        break;

                    case "mebibit per second":
                        finalNumber = initialNumber * 0.000953674d;
                        break;

                    case "gigabit per second":
                        finalNumber = initialNumber * 1e-6;
                        break;

                    case "gigabyte per second":
                        finalNumber = initialNumber * 1.25e-7;
                        break;

                    case "gibibit per second":
                        finalNumber = initialNumber * 9.3132e-7;
                        break;

                    case "terabit per second":
                        finalNumber = initialNumber * 1e-9;
                        break;

                    case "terabyte per second":
                        finalNumber = initialNumber * 1.25e-10;
                        break;

                    case "tebibit per second":
                        finalNumber = initialNumber * 9.0949e-10;
                        break;
                }
            }
            break;

            case "kilobyte per second": {
                switch (to) {
                    case "bit per second":
                        finalNumber = initialNumber * 8000.0d;
                        break;

                    case "kilobit per second":
                        finalNumber = initialNumber * 8.0d;
                        break;

                    case "kibibit per second":
                        finalNumber = initialNumber * 7.8125d;
                        break;

                    case "megabit per second":
                        finalNumber = initialNumber * 0.008d;
                        break;

                    case "megabyte per second":
                        finalNumber = initialNumber * 0.001d;
                        break;

                    case "mebibit per second":
                        finalNumber = initialNumber * 0.00762939d;
                        break;

                    case "gigabit per second":
                        finalNumber = initialNumber * 8e-6;
                        break;

                    case "gigabyte per second":
                        finalNumber = initialNumber * 1e-6;
                        break;

                    case "gibibit per second":
                        finalNumber = initialNumber * 7.4506e-6;
                        break;

                    case "terabit per second":
                        finalNumber = initialNumber * 8e-9;
                        break;

                    case "terabyte per second":
                        finalNumber = initialNumber * 1e-9;
                        break;

                    case "tebibit per second":
                        finalNumber = initialNumber * 7.276e-9;
                        break;
                }
            }
            break;

            case "kibibit per second": {
                switch (to) {
                    case "bit per second":
                        finalNumber = initialNumber * 1024.0d;
                        break;

                    case "kilobit per second":
                        finalNumber = initialNumber * 1.024d;
                        break;

                    case "kilobyte per second":
                        finalNumber = initialNumber * 0.128d;
                        break;

                    case "megabit per second":
                        finalNumber = initialNumber * 0.001024d;
                        break;

                    case "megabyte per second":
                        finalNumber = initialNumber * 0.000128d;
                        break;

                    case "mebibit per second":
                        finalNumber = initialNumber * 0.000976563d;
                        break;

                    case "gigabit per second":
                        finalNumber = initialNumber * 1.024e-6;
                        break;

                    case "gigabyte per second":
                        finalNumber = initialNumber * 1.28e-7;
                        break;

                    case "gibibit per second":
                        finalNumber = initialNumber * 9.5367e-7;
                        break;

                    case "terabit per second":
                        finalNumber = initialNumber * 1.024e-9;
                        break;

                    case "terabyte per second":
                        finalNumber = initialNumber * 1.28e-10;
                        break;

                    case "tebibit per second":
                        finalNumber = initialNumber * 9.3132e-10;
                        break;
                }
            }
            break;

            case "megabit per second": {
                switch (to) {
                    case "bit per second":
                        finalNumber = initialNumber * 1e+6;
                        break;

                    case "kilobit per second":
                        finalNumber = initialNumber * 1000.0d;
                        break;

                    case "kilobyte per second":
                        finalNumber = initialNumber * 125.0d;
                        break;

                    case "kibibit per second":
                        finalNumber = initialNumber * 976.563d;
                        break;

                    case "megabyte per second":
                        finalNumber = initialNumber * 0.125d;
                        break;

                    case "mebibit per second":
                        finalNumber = initialNumber * 0.953674d;
                        break;

                    case "gigabit per second":
                        finalNumber = initialNumber * 0.001d;
                        break;

                    case "gigabyte per second":
                        finalNumber = initialNumber * 0.000125d;
                        break;

                    case "gibibit per second":
                        finalNumber = initialNumber * 0.000931323d;
                        break;

                    case "terabit per second":
                        finalNumber = initialNumber * 1e-6;
                        break;

                    case "terabyte per second":
                        finalNumber = initialNumber * 1.25e-7;
                        break;

                    case "tebibit per second":
                        finalNumber = initialNumber * 9.0949e-7;
                        break;
                }
            }
            break;

            case "megabyte per second": {
                switch (to) {
                    case "bit per second":
                        finalNumber = initialNumber * 8e+6;
                        break;

                    case "kilobit per second":
                        finalNumber = initialNumber * 8000.0d;
                        break;

                    case "kilobyte per second":
                        finalNumber = initialNumber * 1000.0d;
                        break;

                    case "kibibit per second":
                        finalNumber = initialNumber * 7812.5d;
                        break;

                    case "megabit per second":
                        finalNumber = initialNumber * 8.0d;
                        break;

                    case "mebibit per second":
                        finalNumber = initialNumber * 7.62939d;
                        break;

                    case "gigabit per second":
                        finalNumber = initialNumber * 0.008d;
                        break;

                    case "gigabyte per second":
                        finalNumber = initialNumber * 0.001d;
                        break;

                    case "gibibit per second":
                        finalNumber = initialNumber * 0.00745058d;
                        break;

                    case "terabit per second":
                        finalNumber = initialNumber * 8e-6;
                        break;

                    case "terabyte per second":
                        finalNumber = initialNumber * 1e-6;
                        break;

                    case "tebibit per second":
                        finalNumber = initialNumber * 7.276e-6;
                        break;
                }
            }
            break;

            case "mebibit per second": {
                switch (to) {
                    case "bit per second":
                        finalNumber = initialNumber * 1.049e+6;
                        break;

                    case "kilobit per second":
                        finalNumber = initialNumber * 1048.58d;
                        break;

                    case "kilobyte per second":
                        finalNumber = initialNumber * 131.072d;
                        break;

                    case "kibibit per second":
                        finalNumber = initialNumber * 1024.0d;
                        break;

                    case "megabit per second":
                        finalNumber = initialNumber * 1.04858d;
                        break;

                    case "megabyte per second":
                        finalNumber = initialNumber * 0.131072d;
                        break;

                    case "gigabit per second":
                        finalNumber = initialNumber * 0.00104858d;
                        break;

                    case "gigabyte per second":
                        finalNumber = initialNumber * 0.000131072d;
                        break;

                    case "gibibit per second":
                        finalNumber = initialNumber * 0.000976563d;
                        break;

                    case "terabit per second":
                        finalNumber = initialNumber * 1.0486e-6;
                        break;

                    case "terabyte per second":
                        finalNumber = initialNumber * 1.3107e-7;
                        break;

                    case "tebibit per second":
                        finalNumber = initialNumber * 9.5367e-7;
                        break;
                }
            }
            break;

            case "gigabit per second": {
                switch (to) {
                    case "bit per second":
                        finalNumber = initialNumber * 1e+9;
                        break;

                    case "kilobit per second":
                        finalNumber = initialNumber * 1e+6;
                        break;

                    case "kilobyte per second":
                        finalNumber = initialNumber * 125000.0d;
                        break;

                    case "kibibit per second":
                        finalNumber = initialNumber * 976563.0d;
                        break;

                    case "megabit per second":
                        finalNumber = initialNumber * 1000.0d;
                        break;

                    case "megabyte per second":
                        finalNumber = initialNumber * 125.0d;
                        break;

                    case "mebibit per second":
                        finalNumber = initialNumber * 953.674d;
                        break;

                    case "gigabyte per second":
                        finalNumber = initialNumber * 0.125d;
                        break;

                    case "gibibit per second":
                        finalNumber = initialNumber * 0.931323d;
                        break;

                    case "terabit per second":
                        finalNumber = initialNumber * 0.001d;
                        break;

                    case "terabyte per second":
                        finalNumber = initialNumber * 0.000125d;
                        break;

                    case "tebibit per second":
                        finalNumber = initialNumber * 0.000909495d;
                        break;
                }
            }
            break;

            case "gigabyte per second": {
                switch (to) {
                    case "bit per second":
                        finalNumber = initialNumber * 8e+9;
                        break;

                    case "kilobit per second":
                        finalNumber = initialNumber * 8e+6;
                        break;

                    case "kilobyte per second":
                        finalNumber = initialNumber * 1e+6;
                        break;

                    case "kibibit per second":
                        finalNumber = initialNumber * 7.812e+6;
                        break;

                    case "megabit per second":
                        finalNumber = initialNumber * 8000.0d;
                        break;

                    case "megabyte per second":
                        finalNumber = initialNumber * 1000.0d;
                        break;

                    case "mebibit per second":
                        finalNumber = initialNumber * 7629.39d;
                        break;

                    case "gigabit per second":
                        finalNumber = initialNumber * 8.0d;
                        break;

                    case "gibibit per second":
                        finalNumber = initialNumber * 7.45058d;
                        break;

                    case "terabit per second":
                        finalNumber = initialNumber * 0.008d;
                        break;

                    case "terabyte per second":
                        finalNumber = initialNumber * 0.001d;
                        break;

                    case "tebibit per second":
                        finalNumber = initialNumber * 0.00727596d;
                        break;
                }
            }
            break;

            case "gibibit per second": {
                switch (to) {
                    case "bit per second":
                        finalNumber = initialNumber * 1.074e+9;
                        break;

                    case "kilobit per second":
                        finalNumber = initialNumber * 1.074e+6;
                        break;

                    case "kilobyte per second":
                        finalNumber = initialNumber * 134218.0d;
                        break;

                    case "kibibit per second":
                        finalNumber = initialNumber * 1.049e+66;
                        break;

                    case "megabit per second":
                        finalNumber = initialNumber * 1073.74d;
                        break;

                    case "megabyte per second":
                        finalNumber = initialNumber * 134.218d;
                        break;

                    case "mebibit per second":
                        finalNumber = initialNumber * 1024.0d;
                        break;

                    case "gigabit per second":
                        finalNumber = initialNumber * 1.07374d;
                        break;

                    case "gigabyte per second":
                        finalNumber = initialNumber * 0.134218d;
                        break;

                    case "terabit per second":
                        finalNumber = initialNumber * 0.00107374d;
                        break;

                    case "terabyte per second":
                        finalNumber = initialNumber * 0.000134218d;
                        break;

                    case "tebibit per second":
                        finalNumber = initialNumber * 0.000976563d;
                        break;
                }
            }
            break;

            case "terabit per second": {
                switch (to) {
                    case "bit per second":
                        finalNumber = initialNumber * 1e+12;
                        break;

                    case "kilobit per second":
                        finalNumber = initialNumber * 1e+9;
                        break;

                    case "kilobyte per second":
                        finalNumber = initialNumber * 1.25e+8;
                        break;

                    case "kibibit per second":
                        finalNumber = initialNumber * 9.766e+8;
                        break;

                    case "megabit per second":
                        finalNumber = initialNumber * 1e+6;
                        break;

                    case "megabyte per second":
                        finalNumber = initialNumber * 125000.0d;
                        break;

                    case "mebibit per second":
                        finalNumber = initialNumber * 953674.0d;
                        break;

                    case "gigabit per second":
                        finalNumber = initialNumber * 1000.0d;
                        break;

                    case "gigabyte per second":
                        finalNumber = initialNumber * 125.0d;
                        break;

                    case "gibibit per second":
                        finalNumber = initialNumber * 931.323d;
                        break;

                    case "terabyte per second":
                        finalNumber = initialNumber * 0.125d;
                        break;

                    case "tebibit per second":
                        finalNumber = initialNumber * 0.909495d;
                        break;
                }
            }
            break;

            case "terabyte per second": {
                switch (to) {
                    case "bit per second":
                        finalNumber = initialNumber * 8e+12;
                        break;

                    case "kilobit per second":
                        finalNumber = initialNumber * 8e+9;
                        break;

                    case "kilobyte per second":
                        finalNumber = initialNumber * 1e+9;
                        break;

                    case "kibibit per second":
                        finalNumber = initialNumber * 7.812e+9;
                        break;

                    case "megabit per second":
                        finalNumber = initialNumber * 8e+6;
                        break;

                    case "megabyte per second":
                        finalNumber = initialNumber * 1e+6;
                        break;

                    case "mebibit per second":
                        finalNumber = initialNumber * 7.629e+6;
                        break;

                    case "gigabit per second":
                        finalNumber = initialNumber * 8000.0d;
                        break;

                    case "gigabyte per second":
                        finalNumber = initialNumber * 1000.0d;
                        break;

                    case "gibibit per second":
                        finalNumber = initialNumber * 7450.58d;
                        break;

                    case "terabit per second":
                        finalNumber = initialNumber * 8.0d;
                        break;

                    case "tebibit per second":
                        finalNumber = initialNumber * 7.27596d;
                        break;
                }
            }
            break;

            case "tebibit per second": {
                switch (to) {
                    case "bit per second":
                        finalNumber = initialNumber * 1.1e+12;
                        break;

                    case "kilobit per second":
                        finalNumber = initialNumber * 1.1e+9;
                        break;

                    case "kilobyte per second":
                        finalNumber = initialNumber * 1.374e+8;
                        break;

                    case "kibibit per second":
                        finalNumber = initialNumber * 1.074e+9;
                        break;

                    case "megabit per second":
                        finalNumber = initialNumber * 1.1e+6;
                        break;

                    case "megabyte per second":
                        finalNumber = initialNumber * 137439.0d;
                        break;

                    case "mebibit per second":
                        finalNumber = initialNumber * 1.049e+6;
                        break;

                    case "gigabit per second":
                        finalNumber = initialNumber * 1099.51d;
                        break;

                    case "gigabyte per second":
                        finalNumber = initialNumber * 137.439d;
                        break;

                    case "gibibit per second":
                        finalNumber = initialNumber * 1024.0d;
                        break;

                    case "terabit per second":
                        finalNumber = initialNumber * 1.09951d;
                        break;

                    case "terabyte per second":
                        finalNumber = initialNumber * 0.137439d;
                        break;
                }
            }
            break;
        }

        return finalNumber;
    }

    public double digitalStorageConvert(double fromNumber, String fromUnit, String toUnit) {
        double initialNumber = fromNumber;
        double finalNumber = 0.0d;

        String from = fromUnit.toLowerCase();
        String to = toUnit.toLowerCase();

        switch (from) {
            case "byte": {
                switch (to) {
                    case "kilobyte":
                        finalNumber = initialNumber * 0.001d;
                        break;

                    case "kibibyte":
                        finalNumber = initialNumber * 0.000976563d;
                        break;

                    case "megabyte":
                        finalNumber = initialNumber * 1e-6;
                        break;

                    case "mebibyte":
                        finalNumber = initialNumber * 9.5367e-7;
                        break;

                    case "gigabyte":
                        finalNumber = initialNumber * 1e-9;
                        break;

                    case "gibibyte":
                        finalNumber = initialNumber * 9.3132e-10;
                        break;

                    case "terabyte":
                        finalNumber = initialNumber * 1e-12;
                        break;

                    case "tebibyte":
                        finalNumber = initialNumber * 9.0949e-13;
                        break;

                    case "petabyte":
                        finalNumber = initialNumber * 1e-15;
                        break;

                    case "pebibyte":
                        finalNumber = initialNumber * 8.8818e-16;
                }
            }
            break;

            case "kilobyte": {
                switch (to) {
                    case "byte":
                        finalNumber = initialNumber * 1000.0d;
                        break;

                    case "kibibyte":
                        finalNumber = initialNumber * 0.976563d;
                        break;

                    case "megabyte":
                        finalNumber = initialNumber * 0.001d;
                        break;

                    case "mebibyte":
                        finalNumber = initialNumber * 0.000953674d;
                        break;

                    case "gigabyte":
                        finalNumber = initialNumber * 1e-6;
                        break;

                    case "gibibyte":
                        finalNumber = initialNumber * 9.3132e-7;
                        break;

                    case "terabyte":
                        finalNumber = initialNumber * 1e-9;
                        break;

                    case "tebibyte":
                        finalNumber = initialNumber * 9.0949e-10;
                        break;

                    case "petabyte":
                        finalNumber = initialNumber * 1e-12;
                        break;

                    case "pebibyte":
                        finalNumber = initialNumber * 8.8818e-13;
                }
            }
            break;

            case "kibibyte": {
                switch (to) {
                    case "byte":
                        finalNumber = initialNumber * 1024.0d;
                        break;

                    case "kilobyte":
                        finalNumber = initialNumber * 1.024d;
                        break;

                    case "megabyte":
                        finalNumber = initialNumber * 0.001024d;
                        break;

                    case "mebibyte":
                        finalNumber = initialNumber * 0.000976563d;
                        break;

                    case "gigabyte":
                        finalNumber = initialNumber * 1.024e-6;
                        break;

                    case "gibibyte":
                        finalNumber = initialNumber * 9.5367e-7;
                        break;

                    case "terabyte":
                        finalNumber = initialNumber * 1.024e-9;
                        break;

                    case "tebibyte":
                        finalNumber = initialNumber * 9.3132e-10;
                        break;

                    case "petabyte":
                        finalNumber = initialNumber * 1.024e-12;
                        break;

                    case "pebibyte":
                        finalNumber = initialNumber * 9.0949e-13;
                }
            }
            break;

            case "megabyte": {
                switch (to) {
                    case "byte":
                        finalNumber = initialNumber * 1e+6;
                        break;

                    case "kilobyte":
                        finalNumber = initialNumber * 1000.0d;
                        break;

                    case "kibibyte":
                        finalNumber = initialNumber * 976.563d;
                        break;

                    case "mebibyte":
                        finalNumber = initialNumber * 0.953674d;
                        break;

                    case "gigabyte":
                        finalNumber = initialNumber * 0.001d;
                        break;

                    case "gibibyte":
                        finalNumber = initialNumber * 0.000931323d;
                        break;

                    case "terabyte":
                        finalNumber = initialNumber * 1e-6;
                        break;

                    case "tebibyte":
                        finalNumber = initialNumber * 9.0949e-7;
                        break;

                    case "petabyte":
                        finalNumber = initialNumber * 1e-9;
                        break;

                    case "pebibyte":
                        finalNumber = initialNumber * 8.8818e-10;
                }
            }
            break;

            case "mebibyte": {
                switch (to) {
                    case "byte":
                        finalNumber = initialNumber * 1.049e+6;
                        break;

                    case "kilobyte":
                        finalNumber = initialNumber * 1048.58d;
                        break;

                    case "kibibyte":
                        finalNumber = initialNumber * 1024.0d;
                        break;

                    case "megabyte":
                        finalNumber = initialNumber * 1.04858d;
                        break;

                    case "gigabyte":
                        finalNumber = initialNumber * 0.00104858d;
                        break;

                    case "gibibyte":
                        finalNumber = initialNumber * 0.000976563d;
                        break;

                    case "terabyte":
                        finalNumber = initialNumber * 1.0486e-6;
                        break;

                    case "tebibyte":
                        finalNumber = initialNumber * 9.5367e-7;
                        break;

                    case "petabyte":
                        finalNumber = initialNumber * 1.0486e-9;
                        break;

                    case "pebibyte":
                        finalNumber = initialNumber * 9.3132e-10;
                }
            }
            break;

            case "gigabyte": {
                switch (to) {
                    case "byte":
                        finalNumber = initialNumber * 1e+9;
                        break;

                    case "kilobyte":
                        finalNumber = initialNumber * 1e+6;
                        break;

                    case "kibibyte":
                        finalNumber = initialNumber * 976563.0d;
                        break;

                    case "megabyte":
                        finalNumber = initialNumber * 1000.0d;
                        break;

                    case "mebibyte":
                        finalNumber = initialNumber * 953.674d;
                        break;

                    case "gibibyte":
                        finalNumber = initialNumber * 0.931323d;
                        break;

                    case "terabyte":
                        finalNumber = initialNumber * 0.001d;
                        break;

                    case "tebibyte":
                        finalNumber = initialNumber * 0.000909495d;
                        break;

                    case "petabyte":
                        finalNumber = initialNumber * 1e-6;
                        break;

                    case "pebibyte":
                        finalNumber = initialNumber * 8.8818e-7;
                }
            }
            break;

            case "gibibyte": {
                switch (to) {
                    case "byte":
                        finalNumber = initialNumber * 1.074e+9;
                        break;

                    case "kilobyte":
                        finalNumber = initialNumber * 1.074e+6;
                        break;

                    case "kibibyte":
                        finalNumber = initialNumber * 1.049e+6;
                        break;

                    case "megabyte":
                        finalNumber = initialNumber * 1073.74d;
                        break;

                    case "mebibyte":
                        finalNumber = initialNumber * 1024.0d;
                        break;

                    case "gigabyte":
                        finalNumber = initialNumber * 1.07374d;
                        break;

                    case "terabyte":
                        finalNumber = initialNumber * 0.00107374d;
                        break;

                    case "tebibyte":
                        finalNumber = initialNumber * 0.000976563d;
                        break;

                    case "petabyte":
                        finalNumber = initialNumber * 1.0737e-6;
                        break;

                    case "pebibyte":
                        finalNumber = initialNumber * 9.5367e-7;
                }
            }
            break;

            case "terabyte": {
                switch (to) {
                    case "byte":
                        finalNumber = initialNumber * 1e+12;
                        break;

                    case "kilobyte":
                        finalNumber = initialNumber * 1e+9;
                        break;

                    case "kibibyte":
                        finalNumber = initialNumber * 9.766e+8;
                        break;

                    case "megabyte":
                        finalNumber = initialNumber * 1e+6;
                        break;

                    case "mebibyte":
                        finalNumber = initialNumber * 953674.0d;
                        break;

                    case "gigabyte":
                        finalNumber = initialNumber * 1000.0d;
                        break;

                    case "gibibyte":
                        finalNumber = initialNumber * 931.323d;
                        break;

                    case "tebibyte":
                        finalNumber = initialNumber * 0.909495d;
                        break;

                    case "petabyte":
                        finalNumber = initialNumber * 0.001d;
                        break;

                    case "pebibyte":
                        finalNumber = initialNumber * 0.000888178d;
                }
            }
            break;

            case "tebibyte": {
                switch (to) {
                    case "byte":
                        finalNumber = initialNumber * 1.1e+12;
                        break;

                    case "kilobyte":
                        finalNumber = initialNumber * 1.1e+9;
                        break;

                    case "kibibyte":
                        finalNumber = initialNumber * 1.074e+9;
                        break;

                    case "megabyte":
                        finalNumber = initialNumber * 1.1e+6;
                        break;

                    case "mebibyte":
                        finalNumber = initialNumber * 1.049e+6;
                        break;

                    case "gigabyte":
                        finalNumber = initialNumber * 1099.51d;
                        break;

                    case "gibibyte":
                        finalNumber = initialNumber * 1024.0d;
                        break;

                    case "terabyte":
                        finalNumber = initialNumber * 1.09951d;
                        break;

                    case "petabyte":
                        finalNumber = initialNumber * 0.00109951d;
                        break;

                    case "pebibyte":
                        finalNumber = initialNumber * 0.000976563;
                }
            }
            break;

            case "petabyte": {
                switch (to) {
                    case "byte":
                        finalNumber = initialNumber * 1e+15;
                        break;

                    case "kilobyte":
                        finalNumber = initialNumber * 1e+12;
                        break;

                    case "kibibyte":
                        finalNumber = initialNumber * 9.766e+11;
                        break;

                    case "megabyte":
                        finalNumber = initialNumber * 1e+9;
                        break;

                    case "mebibyte":
                        finalNumber = initialNumber * 9.537e+8;
                        break;

                    case "gigabyte":
                        finalNumber = initialNumber * 1e+6;
                        break;

                    case "gibibyte":
                        finalNumber = initialNumber * 931323.0d;
                        break;

                    case "terabyte":
                        finalNumber = initialNumber * 1000.0d;
                        break;

                    case "tebibyte":
                        finalNumber = initialNumber * 909.495d;
                        break;

                    case "pebibyte":
                        finalNumber = initialNumber * 0.888178d;
                }
            }
            break;

            case "pebibyte": {
                switch (to) {
                    case "byte":
                        finalNumber = initialNumber * 1.126e+15;
                        break;

                    case "kilobyte":
                        finalNumber = initialNumber * 1.126e+12;
                        break;

                    case "kibibyte":
                        finalNumber = initialNumber * 1.1e+12;
                        break;

                    case "megabyte":
                        finalNumber = initialNumber * 1.126e+9;
                        break;

                    case "mebibyte":
                        finalNumber = initialNumber * 1.074e+9;
                        break;

                    case "gigabyte":
                        finalNumber = initialNumber * 1.126e+6;
                        break;

                    case "gibibyte":
                        finalNumber = initialNumber * 1.049e+6;
                        break;

                    case "terabyte":
                        finalNumber = initialNumber * 1125.9d;
                        break;

                    case "tebibyte":
                        finalNumber = initialNumber * 1024.0d;
                        break;

                    case "petabyte":
                        finalNumber = initialNumber * 1.1259d;
                }
            }
            break;
        }

        return finalNumber;
    }

    public double energyConvert(double fromNumber, String fromUnit, String toUnit) {
        double initialNumber = fromNumber;
        double finalNumber = 0.0d;

        String from = fromUnit.toLowerCase();
        String to = toUnit.toLowerCase();

        switch (from) {
            case "joule": {
                switch (to) {
                    case "kilojoule":
                        finalNumber = initialNumber * 0.001d;
                        break;

                    case "gram calorie":
                        finalNumber = initialNumber * 0.239006d;
                        break;

                    case "kilocalorie":
                        finalNumber = initialNumber * 0.000239006d;
                        break;

                    case "watt hour":
                        finalNumber = initialNumber * 0.000277778d;
                        break;

                    case "kilowatt hour":
                        finalNumber = initialNumber * 2.7778e-7;
                        break;

                    case "electronvolt":
                        finalNumber = initialNumber * 6.242e+18;
                        break;

                    case "british thermal unit":
                        finalNumber = initialNumber * 0.000947817d;
                        break;

                    case "us therm":
                        finalNumber = initialNumber * 9.4804e-9;
                        break;

                    case "foot-pound":
                        finalNumber = initialNumber * 0.737562d;
                }
            }
            break;

            case "kilojoule": {
                switch (to) {
                    case "joule":
                        finalNumber = initialNumber * 1000.0d;
                        break;

                    case "gram calorie":
                        finalNumber = initialNumber * 239.006d;
                        break;

                    case "kilocalorie":
                        finalNumber = initialNumber * 0.239006d;
                        break;

                    case "watt hour":
                        finalNumber = initialNumber * 0.277778d;
                        break;

                    case "kilowatt hour":
                        finalNumber = initialNumber * 0.000277778d;
                        break;

                    case "electronvolt":
                        finalNumber = initialNumber * 6.242e+21;
                        break;

                    case "british thermal unit":
                        finalNumber = initialNumber * 0.947817d;
                        break;

                    case "us therm":
                        finalNumber = initialNumber * 9.4804e-6;
                        break;

                    case "foot-pound":
                        finalNumber = initialNumber * 737.562d;
                }
            }
            break;

            case "gram calorie": {
                switch (to) {
                    case "joule":
                        finalNumber = initialNumber * 4.184d;
                        break;

                    case "kilojoule":
                        finalNumber = initialNumber * 0.004184d;
                        break;

                    case "kilocalorie":
                        finalNumber = initialNumber * 0.001d;
                        break;

                    case "watt hour":
                        finalNumber = initialNumber * 0.00116222d;
                        break;

                    case "kilowatt hour":
                        finalNumber = initialNumber * 1.1622e-6;
                        break;

                    case "electronvolt":
                        finalNumber = initialNumber * 2.611e+19;
                        break;

                    case "british thermal unit":
                        finalNumber = initialNumber * 0.00396567d;
                        break;

                    case "us therm":
                        finalNumber = initialNumber * 3.9666e-8;
                        break;

                    case "foot-pound":
                        finalNumber = initialNumber * 3.08596d;
                }
            }
            break;

            case "kilocalorie": {
                switch (to) {
                    case "joule":
                        finalNumber = initialNumber * 4184.0d;
                        break;

                    case "kilojoule":
                        finalNumber = initialNumber * 4.184d;
                        break;

                    case "gram calorie":
                        finalNumber = initialNumber * 1000.0d;
                        break;

                    case "watt hour":
                        finalNumber = initialNumber * 1.16222d;
                        break;

                    case "kilowatt hour":
                        finalNumber = initialNumber * 0.00116222d;
                        break;

                    case "electronvolt":
                        finalNumber = initialNumber * 2.611e+22;
                        break;

                    case "british thermal unit":
                        finalNumber = initialNumber * 3.96567d;
                        break;

                    case "us therm":
                        finalNumber = initialNumber * 3.9666e-5;
                        break;

                    case "foot-pound":
                        finalNumber = initialNumber * 3085.96d;
                }
            }
            break;

            case "watt hour": {
                switch (to) {
                    case "joule":
                        finalNumber = initialNumber * 3600.0d;
                        break;

                    case "kilojoule":
                        finalNumber = initialNumber * 3.6d;
                        break;

                    case "gram calorie":
                        finalNumber = initialNumber * 860.421d;
                        break;

                    case "kilocalorie":
                        finalNumber = initialNumber * 0.860421d;
                        break;

                    case "kilowatt hour":
                        finalNumber = initialNumber * 0.001d;
                        break;

                    case "electronvolt":
                        finalNumber = initialNumber * 2.247e+22;
                        break;

                    case "british thermal unit":
                        finalNumber = initialNumber * 3.41214d;
                        break;

                    case "us therm":
                        finalNumber = initialNumber * 3.413e-5;
                        break;

                    case "foot-pound":
                        finalNumber = initialNumber * 2655.22d;
                }
            }
            break;

            case "kilowatt hour": {
                switch (to) {
                    case "joule":
                        finalNumber = initialNumber * 3.6e+6;
                        break;

                    case "kilojoule":
                        finalNumber = initialNumber * 3600.0d;
                        break;

                    case "gram calorie":
                        finalNumber = initialNumber * 860421.0d;
                        break;

                    case "kilocalorie":
                        finalNumber = initialNumber * 860.421d;
                        break;

                    case "watt hour":
                        finalNumber = initialNumber * 1000.0d;
                        break;

                    case "electronvolt":
                        finalNumber = initialNumber * 2.247e+25;
                        break;

                    case "british thermal unit":
                        finalNumber = initialNumber * 3412.14d;
                        break;

                    case "us therm":
                        finalNumber = initialNumber * 0.0341296d;
                        break;

                    case "foot-pound":
                        finalNumber = initialNumber * 2.655e+6;
                }
            }
            break;

            case "electronvolt": {
                switch (to) {
                    case "joule":
                        finalNumber = initialNumber * 1.6022e-19;
                        break;

                    case "kilojoule":
                        finalNumber = initialNumber * 1.6022e-22;
                        break;

                    case "gram calorie":
                        finalNumber = initialNumber * 3.8293e-20;
                        break;

                    case "kilocalorie":
                        finalNumber = initialNumber * 3.8293e-23;
                        break;

                    case "watt hour":
                        finalNumber = initialNumber * 4.4505e-23;
                        break;

                    case "kilowatt hour":
                        finalNumber = initialNumber * 4.4505e-26;
                        break;

                    case "british thermal unit":
                        finalNumber = initialNumber * 1.5186e-22;
                        break;

                    case "us therm":
                        finalNumber = initialNumber * 1.5189e-27;
                        break;

                    case "foot-pound":
                        finalNumber = initialNumber * 1.1817e-19;
                }
            }
            break;

            case "british thermal unit": {
                switch (to) {
                    case "joule":
                        finalNumber = initialNumber * 1055.06d;
                        break;

                    case "kilojoule":
                        finalNumber = initialNumber * 1.05506d;
                        break;

                    case "gram calorie":
                        finalNumber = initialNumber * 252.164d;
                        break;

                    case "kilocalorie":
                        finalNumber = initialNumber * 0.252164d;
                        break;

                    case "watt hour":
                        finalNumber = initialNumber * 0.293071d;
                        break;

                    case "kilowatt hour":
                        finalNumber = initialNumber * 0.000293071d;
                        break;

                    case "electronvolt":
                        finalNumber = initialNumber * 6.585e+21;
                        break;

                    case "us therm":
                        finalNumber = initialNumber * 1.0002e-5;
                        break;

                    case "foot-pound":
                        finalNumber = initialNumber * 778.169d;
                }
            }
            break;

            case "us therm": {
                switch (to) {
                    case "joule":
                        finalNumber = initialNumber * 1.055e+8;
                        break;

                    case "kilojoule":
                        finalNumber = initialNumber * 105480.0d;
                        break;

                    case "gram calorie":
                        finalNumber = initialNumber * 2.521e+7;
                        break;

                    case "kilocalorie":
                        finalNumber = initialNumber * 25210.4d;
                        break;

                    case "watt hour":
                        finalNumber = initialNumber * 29300.1d;
                        break;

                    case "kilowatt hour":
                        finalNumber = initialNumber * 29.3001d;
                        break;

                    case "electronvolt":
                        finalNumber = initialNumber * 6.584e+26;
                        break;

                    case "british thermal unit":
                        finalNumber = initialNumber * 99976.1d;
                        break;

                    case "foot-pound":
                        finalNumber = initialNumber * 7.78e+7;
                }
            }
            break;

            case "foot-pound": {
                switch (to) {
                    case "joule":
                        finalNumber = initialNumber * 1.35582d;
                        break;

                    case "kilojoule":
                        finalNumber = initialNumber * 0.00135582d;
                        break;

                    case "gram calorie":
                        finalNumber = initialNumber * 0.324048d;
                        break;

                    case "kilocalorie":
                        finalNumber = initialNumber * 0.000324048d;
                        break;

                    case "watt hour":
                        finalNumber = initialNumber * 0.000376616d;
                        break;

                    case "kilowatt hour":
                        finalNumber = initialNumber * 3.7662e-7;
                        break;

                    case "electronvolt":
                        finalNumber = initialNumber * 8.462e+18;
                        break;

                    case "british thermal unit":
                        finalNumber = initialNumber * 0.00128507d;
                        break;

                    case "us therm":
                        finalNumber = initialNumber * 1.2854e-8;
                }
            }
            break;
        }

        return finalNumber;
    }

    public double frequencyConvert(double fromNumber, String fromUnit, String toUnit) {
        double initialNumber = fromNumber;
        double finalNumber = 0.0d;

        String from = fromUnit.toLowerCase();
        String to = toUnit.toLowerCase();

        switch (from) {
            case "hertz": {
                switch (to) {
                    case "kilohertz":
                        finalNumber = initialNumber * 0.001d;
                        break;

                    case "megahertz":
                        finalNumber = initialNumber * 1e-6;
                        break;

                    case "gigahertz":
                        finalNumber = initialNumber * 1e-9;
                        break;
                }
            }
            break;

            case "kilohertz": {
                switch (to) {
                    case "hertz":
                        finalNumber = initialNumber * 1000.0d;
                        break;

                    case "megahertz":
                        finalNumber = initialNumber * 0.001d;
                        break;

                    case "gigahertz":
                        finalNumber = initialNumber * 1e-6;
                        break;
                }
            }
            break;

            case "megahertz": {
                switch (to) {
                    case "hertz":
                        finalNumber = initialNumber * 1e+6;
                        break;

                    case "kilohertz":
                        finalNumber = initialNumber * 1000.0d;
                        break;

                    case "gigahertz":
                        finalNumber = initialNumber * 0.001d;
                        break;
                }
            }
            break;

            case "gigahertz": {
                switch (to) {
                    case "hertz":
                        finalNumber = initialNumber * 1e+9;
                        break;

                    case "kilohertz":
                        finalNumber = initialNumber * 1e+6;
                        break;

                    case "megahertz":
                        finalNumber = initialNumber * 1000.0d;
                        break;
                }
            }
            break;
        }

        return finalNumber;
    }

    public double fuelEconomyConvert(double fromNumber, String fromUnit, String toUnit) {
        double initialNumber = fromNumber;
        double finalNumber = 0.0d;

        String from = fromUnit.toLowerCase();
        String to = toUnit.toLowerCase();

        switch (from) {
            case "us miles per gallon": {
                switch (to) {
                    case "miles per gallon (imperial)":
                        finalNumber = initialNumber * 1.20095d;
                        break;

                    case "kilometre per litre":
                        finalNumber = initialNumber * 0.425144d;
                        break;

                    case "litre per 100 kilometres":
                        finalNumber = initialNumber * 235.215d;
                        break;
                }
            }
            break;

            case "miles per gallon (imperial)": {
                switch (to) {
                    case "us miles per gallon":
                        finalNumber = initialNumber * 0.832674d;
                        break;

                    case "kilometre per litre":
                        finalNumber = initialNumber * 0.354006d;
                        break;

                    case "litre per 100 kilometres":
                        finalNumber = initialNumber * 282.481d;
                        break;
                }
            }
            break;

            case "kilometre per litre": {
                switch (to) {
                    case "us miles per gallon":
                        finalNumber = initialNumber * 2.35215d;
                        break;

                    case "miles per gallon (imperial)":
                        finalNumber = initialNumber * 2.82481d;
                        break;

                    case "litre per 100 kilometres":
                        finalNumber = initialNumber * 100.0d;
                        break;
                }
            }
            break;

            case "litre per 100 kilometres": {
                switch (to) {
                    case "us miles per gallon":
                        finalNumber = initialNumber / 235.215d;
                        break;

                    case "miles per gallon (imperial)":
                        finalNumber = initialNumber / 282.481d;
                        break;

                    case "kilometre per litre":
                        finalNumber = initialNumber / 100.0d;
                        break;
                }
            }
            break;
        }

        return finalNumber;
    }

    public double lengthConvert(double fromNumber, String fromUnit, String toUnit) {
        double initialNumber = fromNumber;
        double finalNumber = 0.0d;

        String from = fromUnit.toLowerCase();
        String to = toUnit.toLowerCase();

        switch (from) {
            case "kilometre": {
                switch (to) {
                    case "metre":
                        finalNumber = initialNumber * 1000.0d;
                        break;

                    case "centimetre":
                        finalNumber = initialNumber * 100000.0d;
                        break;

                    case "millimetre":
                        finalNumber = initialNumber * 1e+6;
                        break;

                    case "micrometre":
                        finalNumber = initialNumber * 1e+9;
                        break;

                    case "nanometre":
                        finalNumber = initialNumber * 1e+12;
                        break;

                    case "mile":
                        finalNumber = initialNumber * 0.621371d;
                        break;

                    case "yard":
                        finalNumber = initialNumber * 1093.61d;
                        break;

                    case "foot":
                        finalNumber = initialNumber * 3280.84d;
                        break;

                    case "inch":
                        finalNumber = initialNumber * 39370.1d;
                        break;

                    case "nautical mile":
                        finalNumber = initialNumber * 0.539957d;
                }
            }
            break;

            case "metre": {
                switch (to) {
                    case "kilometre":
                        finalNumber = initialNumber * 0.001d;
                        break;

                    case "centimetre":
                        finalNumber = initialNumber * 100.0d;
                        break;

                    case "millimetre":
                        finalNumber = initialNumber * 1000.0d;
                        break;

                    case "micrometre":
                        finalNumber = initialNumber * 1e+6;
                        break;

                    case "nanometre":
                        finalNumber = initialNumber * 1e+9;
                        break;

                    case "mile":
                        finalNumber = initialNumber * 0.000621371d;
                        break;

                    case "yard":
                        finalNumber = initialNumber * 1.09361d;
                        break;

                    case "foot":
                        finalNumber = initialNumber * 3.28084d;
                        break;

                    case "inch":
                        finalNumber = initialNumber * 39.3701d;
                        break;

                    case "nautical mile":
                        finalNumber = initialNumber * 0.000539957d;
                }
            }
            break;

            case "centimetre": {
                switch (to) {
                    case "kilometre":
                        finalNumber = initialNumber * 1e-5;
                        break;

                    case "metre":
                        finalNumber = initialNumber * 0.01d;
                        break;

                    case "millimetre":
                        finalNumber = initialNumber * 10.0d;
                        break;

                    case "micrometre":
                        finalNumber = initialNumber * 10000.0d;
                        break;

                    case "nanometre":
                        finalNumber = initialNumber * 1e+7;
                        break;

                    case "mile":
                        finalNumber = initialNumber * 6.2137e-6;
                        break;

                    case "yard":
                        finalNumber = initialNumber * 0.0109361d;
                        break;

                    case "foot":
                        finalNumber = initialNumber * 0.0328084d;
                        break;

                    case "inch":
                        finalNumber = initialNumber * 0.393701d;
                        break;

                    case "nautical mile":
                        finalNumber = initialNumber * 5.3996e-6;
                }
            }
            break;

            case "millimetre": {
                switch (to) {
                    case "kilometre":
                        finalNumber = initialNumber * 1e-6;
                        break;

                    case "metre":
                        finalNumber = initialNumber * 0.001d;
                        break;

                    case "centimetre":
                        finalNumber = initialNumber * 0.1d;
                        break;

                    case "micrometre":
                        finalNumber = initialNumber * 1000.0d;
                        break;

                    case "nanometre":
                        finalNumber = initialNumber * 1e+6;
                        break;

                    case "mile":
                        finalNumber = initialNumber * 6.2137e-7;
                        break;

                    case "yard":
                        finalNumber = initialNumber * 0.00109361d;
                        break;

                    case "foot":
                        finalNumber = initialNumber * 0.00328084d;
                        break;

                    case "inch":
                        finalNumber = initialNumber * 0.0393701d;
                        break;

                    case "nautical mile":
                        finalNumber = initialNumber * 5.3996e-7;
                }
            }
            break;

            case "micrometre": {
                switch (to) {
                    case "kilometre":
                        finalNumber = initialNumber * 1e-9;
                        break;

                    case "metre":
                        finalNumber = initialNumber * 1e-6;
                        break;

                    case "centimetre":
                        finalNumber = initialNumber * 1e-4;
                        break;

                    case "millimetre":
                        finalNumber = initialNumber * 0.001d;
                        break;

                    case "nanometre":
                        finalNumber = initialNumber * 1000.0d;
                        break;

                    case "mile":
                        finalNumber = initialNumber * 6.2137e-10;
                        break;

                    case "yard":
                        finalNumber = initialNumber * 1.0936e-6;
                        break;

                    case "foot":
                        finalNumber = initialNumber * 3.2808e-6;
                        break;

                    case "inch":
                        finalNumber = initialNumber * 3.937e-5;
                        break;

                    case "nautical mile":
                        finalNumber = initialNumber * 5.3996e-10;
                }
            }
            break;

            case "nanometre": {
                switch (to) {
                    case "kilometre":
                        finalNumber = initialNumber * 1e-12;
                        break;

                    case "metre":
                        finalNumber = initialNumber * 1e-9;
                        break;

                    case "centimetre":
                        finalNumber = initialNumber * 1e-7;
                        break;

                    case "millimetre":
                        finalNumber = initialNumber * 1e-6;
                        break;

                    case "micrometre":
                        finalNumber = initialNumber * 0.001d;
                        break;

                    case "mile":
                        finalNumber = initialNumber * 6.2137e-13;
                        break;

                    case "yard":
                        finalNumber = initialNumber * 1.0936e-9;
                        break;

                    case "foot":
                        finalNumber = initialNumber * 3.2808e-9;
                        break;

                    case "inch":
                        finalNumber = initialNumber * 3.937e-8;
                        break;

                    case "nautical mile":
                        finalNumber = initialNumber * 5.3996e-13;
                }
            }
            break;

            case "mile": {
                switch (to) {
                    case "kilometre":
                        finalNumber = initialNumber * 1.60934d;
                        break;

                    case "metre":
                        finalNumber = initialNumber * 1609.34d;
                        break;

                    case "centimetre":
                        finalNumber = initialNumber * 160934.0d;
                        break;

                    case "millimetre":
                        finalNumber = initialNumber * 1.609e+6;
                        break;

                    case "micrometre":
                        finalNumber = initialNumber * 1.609e+9;
                        break;

                    case "nanometre":
                        finalNumber = initialNumber * 1.609e+12;
                        break;

                    case "yard":
                        finalNumber = initialNumber * 1760.0d;
                        break;

                    case "foot":
                        finalNumber = initialNumber * 5280.0d;
                        break;

                    case "inch":
                        finalNumber = initialNumber * 63360.0d;
                        break;

                    case "nautical mile":
                        finalNumber = initialNumber * 0.868976d;
                }
            }
            break;

            case "yard": {
                switch (to) {
                    case "kilometre":
                        finalNumber = initialNumber * 0.0009144d;
                        break;

                    case "metre":
                        finalNumber = initialNumber * 0.9144d;
                        break;

                    case "centimetre":
                        finalNumber = initialNumber * 91.44d;
                        break;

                    case "millimetre":
                        finalNumber = initialNumber * 914.4d;
                        break;

                    case "micrometre":
                        finalNumber = initialNumber * 914400.0d;
                        break;

                    case "nanometre":
                        finalNumber = initialNumber * 9.144e+8;
                        break;

                    case "mile":
                        finalNumber = initialNumber * 0.000568182d;
                        break;

                    case "foot":
                        finalNumber = initialNumber * 3.0d;
                        break;

                    case "inch":
                        finalNumber = initialNumber * 36.0d;
                        break;

                    case "nautical mile":
                        finalNumber = initialNumber * 0.000493737d;
                }
            }
            break;

            case "foot": {
                switch (to) {
                    case "kilometre":
                        finalNumber = initialNumber * 0.0003048d;
                        break;

                    case "metre":
                        finalNumber = initialNumber * 0.3048d;
                        break;

                    case "centimetre":
                        finalNumber = initialNumber * 30.48d;
                        break;

                    case "millimetre":
                        finalNumber = initialNumber * 304.8d;
                        break;

                    case "micrometre":
                        finalNumber = initialNumber * 304800.0d;
                        break;

                    case "nanometre":
                        finalNumber = initialNumber * 3.048e+8;
                        break;

                    case "mile":
                        finalNumber = initialNumber * 0.000189394d;
                        break;

                    case "yard":
                        finalNumber = initialNumber * 0.333333d;
                        break;

                    case "inch":
                        finalNumber = initialNumber * 12.0d;
                        break;

                    case "nautical mile":
                        finalNumber = initialNumber * 0.000164579d;
                }
            }
            break;

            case "inch": {
                switch (to) {
                    case "kilometre":
                        finalNumber = initialNumber * 2.54e-5;
                        break;

                    case "metre":
                        finalNumber = initialNumber * 0.0254d;
                        break;

                    case "centimetre":
                        finalNumber = initialNumber * 2.54d;
                        break;

                    case "millimetre":
                        finalNumber = initialNumber * 25.4d;
                        break;

                    case "micrometre":
                        finalNumber = initialNumber * 25400.0d;
                        break;

                    case "nanometre":
                        finalNumber = initialNumber * 2.54e+7;
                        break;

                    case "mile":
                        finalNumber = initialNumber * 1.5783e-5;
                        break;

                    case "yard":
                        finalNumber = initialNumber * 0.0277778d;
                        break;

                    case "foot":
                        finalNumber = initialNumber * 0.0833333d;
                        break;

                    case "nautical mile":
                        finalNumber = initialNumber * 1.3715e-5;
                }
            }
            break;

            case "nautical mile": {
                switch (to) {
                    case "kilometre":
                        finalNumber = initialNumber * 1.852d;
                        break;

                    case "metre":
                        finalNumber = initialNumber * 1852.0d;
                        break;

                    case "centimetre":
                        finalNumber = initialNumber * 185200.0d;
                        break;

                    case "millimetre":
                        finalNumber = initialNumber * 1.852e+6;
                        break;

                    case "micrometre":
                        finalNumber = initialNumber * 1.852e+9;
                        break;

                    case "nanometre":
                        finalNumber = initialNumber * 1.852e+12;
                        break;

                    case "mile":
                        finalNumber = initialNumber * 1.15078d;
                        break;

                    case "yard":
                        finalNumber = initialNumber * 2025.37d;
                        break;

                    case "foot":
                        finalNumber = initialNumber * 6076.12d;
                        break;

                    case "inch":
                        finalNumber = initialNumber * 72913.4d;
                }
            }
            break;
        }

        return finalNumber;
    }

    public double massConvert(double fromNumber, String fromUnit, String toUnit) {
        double initialNumber = fromNumber;
        double finalNumber = 0.0d;

        String from = fromUnit.toLowerCase();
        String to = toUnit.toLowerCase();

        switch (from) {
            case "tonne": {
                switch (to) {
                    case "kilogram":
                        finalNumber = initialNumber * 1000.0d;
                        break;

                    case "gram":
                        finalNumber = initialNumber * 1e+6;
                        break;

                    case "milligram":
                        finalNumber = initialNumber * 1e+9;
                        break;

                    case "microgram":
                        finalNumber = initialNumber * 1e+12;
                        break;

                    case "imperial ton":
                        finalNumber = initialNumber * 0.984207d;
                        break;

                    case "us ton":
                        finalNumber = initialNumber * 1.10231d;
                        break;

                    case "stone":
                        finalNumber = initialNumber * 157.473d;
                        break;

                    case "pound":
                        finalNumber = initialNumber * 2204.62d;
                        break;

                    case "ounce":
                        finalNumber = initialNumber * 35274.0d;
                        break;
                }
            }
            break;

            case "kilogram": {
                switch (to) {
                    case "tonne":
                        finalNumber = initialNumber * 0.001d;
                        break;

                    case "gram":
                        finalNumber = initialNumber * 1000.0d;
                        break;

                    case "milligram":
                        finalNumber = initialNumber * 1e+6;
                        break;

                    case "microgram":
                        finalNumber = initialNumber * 1e+9;
                        break;

                    case "imperial ton":
                        finalNumber = initialNumber * 0.000984207d;
                        break;

                    case "us ton":
                        finalNumber = initialNumber * 0.00110231d;
                        break;

                    case "stone":
                        finalNumber = initialNumber * 0.157473d;
                        break;

                    case "pound":
                        finalNumber = initialNumber * 2.20462d;
                        break;

                    case "ounce":
                        finalNumber = initialNumber * 35.274d;
                        break;
                }
            }
            break;

            case "gram": {
                switch (to) {
                    case "tonne":
                        finalNumber = initialNumber * 1e-6;
                        break;

                    case "kilogram":
                        finalNumber = initialNumber * 0.001d;
                        break;

                    case "milligram":
                        finalNumber = initialNumber * 1000.0d;
                        break;

                    case "microgram":
                        finalNumber = initialNumber * 1e+6;
                        break;

                    case "imperial ton":
                        finalNumber = initialNumber * 9.8421e-7;
                        break;

                    case "us ton":
                        finalNumber = initialNumber * 1.1023e-6;
                        break;

                    case "stone":
                        finalNumber = initialNumber * 0.000157473d;
                        break;

                    case "pound":
                        finalNumber = initialNumber * 0.00220462d;
                        break;

                    case "ounce":
                        finalNumber = initialNumber * 0.035274d;
                        break;
                }
            }
            break;

            case "milligram": {
                switch (to) {
                    case "tonne":
                        finalNumber = initialNumber * 1e-9;
                        break;

                    case "kilogram":
                        finalNumber = initialNumber * 1e-6;
                        break;

                    case "gram":
                        finalNumber = initialNumber * 0.001d;
                        break;

                    case "microgram":
                        finalNumber = initialNumber * 1000.0d;
                        break;

                    case "imperial ton":
                        finalNumber = initialNumber * 9.8421e-10;
                        break;

                    case "us ton":
                        finalNumber = initialNumber * 1.1023e-9;
                        break;

                    case "stone":
                        finalNumber = initialNumber * 1.5747e-7;
                        break;

                    case "pound":
                        finalNumber = initialNumber * 2.2046e-6;
                        break;

                    case "ounce":
                        finalNumber = initialNumber * 3.5274e-5;
                        break;
                }
            }
            break;

            case "microgram": {
                switch (to) {
                    case "tonne":
                        finalNumber = initialNumber * 1e-12;
                        break;

                    case "kilogram":
                        finalNumber = initialNumber * 1e-9;
                        break;

                    case "gram":
                        finalNumber = initialNumber * 1e-6;
                        break;

                    case "milligram":
                        finalNumber = initialNumber * 0.001d;
                        break;

                    case "imperial ton":
                        finalNumber = initialNumber * 9.8421e-13;
                        break;

                    case "us ton":
                        finalNumber = initialNumber * 1.1023e-12;
                        break;

                    case "stone":
                        finalNumber = initialNumber * 1.5747e-10;
                        break;

                    case "pound":
                        finalNumber = initialNumber * 2.2046e-9;
                        break;

                    case "ounce":
                        finalNumber = initialNumber * 3.5274e-8;
                        break;
                }
            }
            break;

            case "imperial ton": {
                switch (to) {
                    case "tonne":
                        finalNumber = initialNumber * 1.01605d;
                        break;

                    case "kilogram":
                        finalNumber = initialNumber * 1016.05d;
                        break;

                    case "gram":
                        finalNumber = initialNumber * 1.016e+6;
                        break;

                    case "milligram":
                        finalNumber = initialNumber * 1.016e+9;
                        break;

                    case "microgram":
                        finalNumber = initialNumber * 1.016e+12;
                        break;

                    case "us ton":
                        finalNumber = initialNumber * 1.12d;
                        break;

                    case "stone":
                        finalNumber = initialNumber * 160.0d;
                        break;

                    case "pound":
                        finalNumber = initialNumber * 2240.0d;
                        break;

                    case "ounce":
                        finalNumber = initialNumber * 35840.0d;
                        break;
                }
            }
            break;

            case "us ton": {
                switch (to) {
                    case "tonne":
                        finalNumber = initialNumber * 0.907185d;
                        break;

                    case "kilogram":
                        finalNumber = initialNumber * 907.185d;
                        break;

                    case "gram":
                        finalNumber = initialNumber * 907185.0d;
                        break;

                    case "milligram":
                        finalNumber = initialNumber * 9.072e+8;
                        break;

                    case "microgram":
                        finalNumber = initialNumber * 9.072e+11;
                        break;

                    case "imperial ton":
                        finalNumber = initialNumber * 0.892857d;
                        break;

                    case "stone":
                        finalNumber = initialNumber * 142.857d;
                        break;

                    case "pound":
                        finalNumber = initialNumber * 2000.0d;
                        break;

                    case "ounce":
                        finalNumber = initialNumber * 32000.0d;
                        break;
                }
            }
            break;

            case "stone": {
                switch (to) {
                    case "tonne":
                        finalNumber = initialNumber * 0.00635029d;
                        break;

                    case "kilogram":
                        finalNumber = initialNumber * 6.35029d;
                        break;

                    case "gram":
                        finalNumber = initialNumber * 6350.29d;
                        break;

                    case "milligram":
                        finalNumber = initialNumber * 6.35e+6;
                        break;

                    case "microgram":
                        finalNumber = initialNumber * 6.35e+9;
                        break;

                    case "imperial ton":
                        finalNumber = initialNumber * 0.00625d;
                        break;

                    case "us ton":
                        finalNumber = initialNumber * 0.007d;
                        break;

                    case "pound":
                        finalNumber = initialNumber * 14.0d;
                        break;

                    case "ounce":
                        finalNumber = initialNumber * 224.0d;
                        break;
                }
            }
            break;

            case "pound": {
                switch (to) {
                    case "tonne":
                        finalNumber = initialNumber * 0.000453592d;
                        break;

                    case "kilogram":
                        finalNumber = initialNumber * 0.453592d;
                        break;

                    case "gram":
                        finalNumber = initialNumber * 453.592d;
                        break;

                    case "milligram":
                        finalNumber = initialNumber * 453592.0d;
                        break;

                    case "microgram":
                        finalNumber = initialNumber * 4.536e+8;
                        break;

                    case "imperial ton":
                        finalNumber = initialNumber * 0.000446429d;
                        break;

                    case "us ton":
                        finalNumber = initialNumber * 0.0005d;
                        break;

                    case "stone":
                        finalNumber = initialNumber * 0.0714286d;
                        break;

                    case "ounce":
                        finalNumber = initialNumber * 16.0d;
                        break;
                }
            }
            break;

            case "ounce": {
                switch (to) {
                    case "tonne":
                        finalNumber = initialNumber * 2.835e-5;
                        break;

                    case "kilogram":
                        finalNumber = initialNumber * 0.0283495d;
                        break;

                    case "gram":
                        finalNumber = initialNumber * 28.3495d;
                        break;

                    case "milligram":
                        finalNumber = initialNumber * 28349.5d;
                        break;

                    case "microgram":
                        finalNumber = initialNumber * 2.835e+7;
                        break;

                    case "imperial ton":
                        finalNumber = initialNumber * 2.7902e-5;
                        break;

                    case "us ton":
                        finalNumber = initialNumber * 3.125e-5;
                        break;

                    case "stone":
                        finalNumber = initialNumber * 0.00446429d;
                        break;

                    case "pound":
                        finalNumber = initialNumber * 0.0625d;
                        break;
                }
            }
            break;
        }

        return finalNumber;
    }

    public double planeAngleConvert(double fromNumber, String fromUnit, String toUnit) {
        double initialNumber = fromNumber;
        double finalNumber = 0.0d;

        String from = fromUnit.toLowerCase();
        String to = toUnit.toLowerCase();

        switch (from) {
            case "degree": {
                switch (to) {
                    case "gradian":
                        finalNumber = initialNumber * 1.11111d;
                        break;

                    case "milliradian":
                        finalNumber = initialNumber * 17.4533d;
                        break;

                    case "minute of arc":
                        finalNumber = initialNumber * 60.0d;
                        break;

                    case "radian":
                        finalNumber = initialNumber * 0.0174533d;
                        break;

                    case "second of arc":
                        finalNumber = initialNumber * 3600.0d;
                        break;
                }
            }
            break;

            case "gradian": {
                switch (to) {
                    case "degree":
                        finalNumber = initialNumber * 0.9d;
                        break;

                    case "milliradian":
                        finalNumber = initialNumber * 15.708d;
                        break;

                    case "minute of arc":
                        finalNumber = initialNumber * 54.0d;
                        break;

                    case "radian":
                        finalNumber = initialNumber * 0.015708d;
                        break;

                    case "second of arc":
                        finalNumber = initialNumber * 3240.0d;
                        break;
                }
            }
            break;

            case "milliradian": {
                switch (to) {
                    case "degree":
                        finalNumber = initialNumber * 0.0572958d;
                        break;

                    case "gradian":
                        finalNumber = initialNumber * 0.063662d;
                        break;

                    case "minute of arc":
                        finalNumber = initialNumber * 3.43775d;
                        break;

                    case "radian":
                        finalNumber = initialNumber * 0.001d;
                        break;

                    case "second of arc":
                        finalNumber = initialNumber * 206.265d;
                        break;
                }
            }
            break;

            case "minute of arc": {
                switch (to) {
                    case "degree":
                        finalNumber = initialNumber * 0.0166667d;
                        break;

                    case "gradian":
                        finalNumber = initialNumber * 0.0185185d;
                        break;

                    case "milliradian":
                        finalNumber = initialNumber * 0.290888d;
                        break;

                    case "radian":
                        finalNumber = initialNumber * 0.000290888d;
                        break;

                    case "second of arc":
                        finalNumber = initialNumber * 60.0d;
                        break;
                }
            }
            break;

            case "radian": {
                switch (to) {
                    case "degree":
                        finalNumber = initialNumber * 57.2958d;
                        break;

                    case "gradian":
                        finalNumber = initialNumber * 63.662d;
                        break;

                    case "milliradian":
                        finalNumber = initialNumber * 1000.0d;
                        break;

                    case "minute of arc":
                        finalNumber = initialNumber * 3437.75d;
                        break;

                    case "second of arc":
                        finalNumber = initialNumber * 206265.0d;
                        break;
                }
            }
            break;

            case "second of arc": {
                switch (to) {
                    case "degree":
                        finalNumber = initialNumber * 0.000277778d;
                        break;

                    case "gradian":
                        finalNumber = initialNumber * 0.000308642d;
                        break;

                    case "milliradian":
                        finalNumber = initialNumber * 0.00484814d;
                        break;

                    case "minute of arc":
                        finalNumber = initialNumber * 0.0166667d;
                        break;

                    case "radian":
                        finalNumber = initialNumber * 4.8481e-6;
                        break;
                }
            }
            break;
        }

        return finalNumber;
    }

    public double pressureConvert(double fromNumber, String fromUnit, String toUnit) {
        double initialNumber = fromNumber;
        double finalNumber = 0.0d;

        String from = fromUnit.toLowerCase();
        String to = toUnit.toLowerCase();

        switch (from) {
            case "atmosphere": {
                switch (to) {
                    case "bar":
                        finalNumber = initialNumber * 1.01325d;
                        break;

                    case "pascal":
                        finalNumber = initialNumber * 101325.0d;
                        break;

                    case "pound-force per square inch":
                        finalNumber = initialNumber * 14.6959d;
                        break;

                    case "torr":
                        finalNumber = initialNumber * 760.0d;
                        break;
                }
            }
            break;

            case "bar": {
                switch (to) {
                    case "atmosphere":
                        finalNumber = initialNumber * 0.986923d;
                        break;

                    case "pascal":
                        finalNumber = initialNumber * 100000.0d;
                        break;

                    case "pound-force per square inch":
                        finalNumber = initialNumber * 14.5038d;
                        break;

                    case "torr":
                        finalNumber = initialNumber * 750.062d;
                        break;
                }
            }
            break;

            case "pascal": {
                switch (to) {
                    case "atmosphere":
                        finalNumber = initialNumber * 9.8692e-6;
                        break;

                    case "bar":
                        finalNumber = initialNumber * 1e-5;
                        break;

                    case "pound-force per square inch":
                        finalNumber = initialNumber * 0.000145038d;
                        break;

                    case "torr":
                        finalNumber = initialNumber * 0.00750062d;
                        break;
                }
            }
            break;

            case "pound-force per square inch": {
                switch (to) {
                    case "atmosphere":
                        finalNumber = initialNumber * 0.068046d;
                        break;

                    case "bar":
                        finalNumber = initialNumber * 0.0689476d;
                        break;

                    case "pascal":
                        finalNumber = initialNumber * 6894.76d;
                        break;

                    case "torr":
                        finalNumber = initialNumber * 51.7149d;
                        break;
                }
            }
            break;

            case "torr": {
                switch (to) {
                    case "atmosphere":
                        finalNumber = initialNumber * 0.00131579d;
                        break;

                    case "bar":
                        finalNumber = initialNumber * 0.00133322d;
                        break;

                    case "pascal":
                        finalNumber = initialNumber * 133.322d;
                        break;

                    case "pound-force per square inch":
                        finalNumber = initialNumber * 0.0193368d;
                        break;
                }
            }
            break;
        }

        return finalNumber;
    }

    public double speedConvert(double fromNumber, String fromUnit, String toUnit) {
        double initialNumber = fromNumber;
        double finalNumber = 0.0d;

        String from = fromUnit.toLowerCase();
        String to = toUnit.toLowerCase();

        switch (from) {
            case "miles per hour": {
                switch (to) {
                    case "foot per second":
                        finalNumber = initialNumber * 1.46667d;
                        break;

                    case "metre per second":
                        finalNumber = initialNumber * 0.44704d;
                        break;

                    case "kilometre per hour":
                        finalNumber = initialNumber * 1.60934d;
                        break;

                    case "knot":
                        finalNumber = initialNumber * 0.868976d;
                        break;
                }
            }
            break;

            case "foot per second": {
                switch (to) {
                    case "miles per hour":
                        finalNumber = initialNumber * 0.681818d;
                        break;

                    case "metre per second":
                        finalNumber = initialNumber * 0.3048d;
                        break;

                    case "kilometre per hour":
                        finalNumber = initialNumber * 1.09728d;
                        break;

                    case "knot":
                        finalNumber = initialNumber * 0.592484d;
                        break;
                }
            }
            break;

            case "metre per second": {
                switch (to) {
                    case "miles per hour":
                        finalNumber = initialNumber * 2.23694d;
                        break;

                    case "foot per second":
                        finalNumber = initialNumber * 3.28084d;
                        break;

                    case "kilometre per hour":
                        finalNumber = initialNumber * 3.6d;
                        break;

                    case "knot":
                        finalNumber = initialNumber * 1.94384d;
                        break;
                }
            }
            break;

            case "kilometre per hour": {
                switch (to) {
                    case "miles per hour":
                        finalNumber = initialNumber * 0.621371d;
                        break;

                    case "foot per second":
                        finalNumber = initialNumber * 0.911344d;
                        break;

                    case "metre per second":
                        finalNumber = initialNumber * 0.277778d;
                        break;

                    case "knot":
                        finalNumber = initialNumber * 0.539957d;
                        break;
                }
            }
            break;

            case "knot": {
                switch (to) {
                    case "miles per hour":
                        finalNumber = initialNumber * 1.15078d;
                        break;

                    case "foot per second":
                        finalNumber = initialNumber * 1.68781d;
                        break;

                    case "metre per second":
                        finalNumber = initialNumber * 0.514444d;
                        break;

                    case "kilometre per hour":
                        finalNumber = initialNumber * 1.852d;
                        break;
                }
            }
            break;
        }

        return finalNumber;
    }

    public double temperatureConvert(double fromNumber, String fromUnit, String toUnit) {
        double initialNumber = fromNumber;
        double finalNumber = 0.0d;

        String from = fromUnit.toLowerCase();
        String to = toUnit.toLowerCase();

        switch (from) {
            case "celsius": {
                switch (to) {
                    case "fahrenheit":
                        finalNumber = 32.0d + (initialNumber * 1.8d);
                        break;

                    case "kelvin":
                        finalNumber = 273.15d + initialNumber;
                        break;
                }
            }
            break;

            case "fahrenheit": {
                switch (to) {
                    case "celsius":
                        finalNumber = -17.7778d + (initialNumber * 0.5556d);
                        break;

                    case "kelvin":
                        finalNumber = 255.372d + (initialNumber * 0.556d);
                        break;
                }
            }
            break;

            case "kelvin": {
                switch (to) {
                    case "celsius":
                        finalNumber = -273.15d + initialNumber;
                        break;

                    case "fahrenheit":
                        finalNumber = -459.67d + (initialNumber * 1.8d);
                        break;
                }
            }
            break;
        }

        return finalNumber;
    }

    public double timeConvert(double fromNumber, String fromUnit, String toUnit) {
        double initialNumber = fromNumber;
        double finalNumber = 0.0d;

        String from = fromUnit.toLowerCase();
        String to = toUnit.toLowerCase();

        switch (from) {
            case "nanosecond": {
                switch (to) {
                    case "microsecond":
                        finalNumber = initialNumber * 0.001d;
                        break;

                    case "millisecond":
                        finalNumber = initialNumber * 1e-6;
                        break;

                    case "second":
                        finalNumber = initialNumber * 1e-9;
                        break;

                    case "minute":
                        finalNumber = initialNumber * 1.6667e-11;
                        break;

                    case "hour":
                        finalNumber = initialNumber * 2.7778e-13;
                        break;

                    case "day":
                        finalNumber = initialNumber * 1.1574e-14;
                        break;

                    case "week":
                        finalNumber = initialNumber * 1.6534e-15;
                        break;

                    case "month":
                        finalNumber = initialNumber * 3.8052e-16;
                        break;

                    case "year":
                        finalNumber = initialNumber * 3.171e-17;
                        break;

                    case "decade":
                        finalNumber = initialNumber * 3.171e-18;
                        break;

                    case "century":
                        finalNumber = initialNumber * 3.171e-19;
                }
            }
            break;

            case "microsecond": {
                switch (to) {
                    case "nanosecond":
                        finalNumber = initialNumber * 1000.0d;
                        break;

                    case "millisecond":
                        finalNumber = initialNumber * 0.001d;
                        break;

                    case "second":
                        finalNumber = initialNumber * 1e-6;
                        break;

                    case "minute":
                        finalNumber = initialNumber * 1.6667e-8;
                        break;

                    case "hour":
                        finalNumber = initialNumber * 2.7778e-10;
                        break;

                    case "day":
                        finalNumber = initialNumber * 1.1574e-11;
                        break;

                    case "week":
                        finalNumber = initialNumber * 1.6534e-12;
                        break;

                    case "month":
                        finalNumber = initialNumber * 3.8052e-13;
                        break;

                    case "year":
                        finalNumber = initialNumber * 3.171e-14;
                        break;

                    case "decade":
                        finalNumber = initialNumber * 3.171e-15;
                        break;

                    case "century":
                        finalNumber = initialNumber * 3.171e-16;
                }
            }
            break;

            case "millisecond": {
                switch (to) {
                    case "nanosecond":
                        finalNumber = initialNumber * 1e+6;
                        break;

                    case "microsecond":
                        finalNumber = initialNumber * 1000.0d;
                        break;

                    case "second":
                        finalNumber = initialNumber * 0.001d;
                        break;

                    case "minute":
                        finalNumber = initialNumber * 1.6667e-5;
                        break;

                    case "hour":
                        finalNumber = initialNumber * 2.7778e-7;
                        break;

                    case "day":
                        finalNumber = initialNumber * 1.1574e-8;
                        break;

                    case "week":
                        finalNumber = initialNumber * 1.6534e-9;
                        break;

                    case "month":
                        finalNumber = initialNumber * 3.8052e-10;
                        break;

                    case "year":
                        finalNumber = initialNumber * 3.171e-11;
                        break;

                    case "decade":
                        finalNumber = initialNumber * 3.171e-12;
                        break;

                    case "century":
                        finalNumber = initialNumber * 3.171e-13;
                }
            }
            break;

            case "second": {
                switch (to) {
                    case "nanosecond":
                        finalNumber = initialNumber * 1e+9;
                        break;

                    case "microsecond":
                        finalNumber = initialNumber * 1e+6;
                        break;

                    case "millisecond":
                        finalNumber = initialNumber * 1000.0d;
                        break;

                    case "minute":
                        finalNumber = initialNumber * 0.0166667d;
                        break;

                    case "hour":
                        finalNumber = initialNumber * 0.000277778d;
                        break;

                    case "day":
                        finalNumber = initialNumber * 1.1574e-5;
                        break;

                    case "week":
                        finalNumber = initialNumber * 1.6534e-6;
                        break;

                    case "month":
                        finalNumber = initialNumber * 3.8052e-7;
                        break;

                    case "year":
                        finalNumber = initialNumber * 3.171e-8;
                        break;

                    case "decade":
                        finalNumber = initialNumber * 3.171e-9;
                        break;

                    case "century":
                        finalNumber = initialNumber * 3.171e-10;
                }
            }
            break;

            case "minute": {
                switch (to) {
                    case "nanosecond":
                        finalNumber = initialNumber * 6e+10;
                        break;

                    case "microsecond":
                        finalNumber = initialNumber * 6e+7;
                        break;

                    case "millisecond":
                        finalNumber = initialNumber * 60000.0d;
                        break;

                    case "second":
                        finalNumber = initialNumber * 60.0d;
                        break;

                    case "hour":
                        finalNumber = initialNumber * 0.0166667d;
                        break;

                    case "day":
                        finalNumber = initialNumber * 0.000694444d;
                        break;

                    case "week":
                        finalNumber = initialNumber * 9.9206e-5;
                        break;

                    case "month":
                        finalNumber = initialNumber * 2.2831e-5;
                        break;

                    case "year":
                        finalNumber = initialNumber * 1.9026e-6;
                        break;

                    case "decade":
                        finalNumber = initialNumber * 1.9026e-7;
                        break;

                    case "century":
                        finalNumber = initialNumber * 1.9026e-8;
                }
            }
            break;

            case "hour": {
                switch (to) {
                    case "nanosecond":
                        finalNumber = initialNumber * 3.6e+12;
                        break;

                    case "microsecond":
                        finalNumber = initialNumber * 3.6e+9;
                        break;

                    case "millisecond":
                        finalNumber = initialNumber * 3.6e+6;
                        break;

                    case "second":
                        finalNumber = initialNumber * 3600.0d;
                        break;

                    case "minute":
                        finalNumber = initialNumber * 60.0d;
                        break;

                    case "day":
                        finalNumber = initialNumber * 0.0416667d;
                        break;

                    case "week":
                        finalNumber = initialNumber * 0.00595238d;
                        break;

                    case "month":
                        finalNumber = initialNumber * 0.00136986d;
                        break;

                    case "year":
                        finalNumber = initialNumber * 0.000114155d;
                        break;

                    case "decade":
                        finalNumber = initialNumber * 1.1416e-5;
                        break;

                    case "century":
                        finalNumber = initialNumber * 1.1416e-6;
                }
            }
            break;

            case "day": {
                switch (to) {
                    case "nanosecond":
                        finalNumber = initialNumber * 8.64e+13;
                        break;

                    case "microsecond":
                        finalNumber = initialNumber * 8.64e+10;
                        break;

                    case "millisecond":
                        finalNumber = initialNumber * 8.64e+7;
                        break;

                    case "second":
                        finalNumber = initialNumber * 86400.0d;
                        break;

                    case "minute":
                        finalNumber = initialNumber * 1440.0d;
                        break;

                    case "hour":
                        finalNumber = initialNumber * 24.0d;
                        break;

                    case "week":
                        finalNumber = initialNumber * 0.142857d;
                        break;

                    case "month":
                        finalNumber = initialNumber * 0.0328767d;
                        break;

                    case "year":
                        finalNumber = initialNumber * 0.00273973d;
                        break;

                    case "decade":
                        finalNumber = initialNumber * 0.000273973d;
                        break;

                    case "century":
                        finalNumber = initialNumber * 2.7397e-5;
                }
            }
            break;

            case "week": {
                switch (to) {
                    case "nanosecond":
                        finalNumber = initialNumber * 6.048e+14;
                        break;

                    case "microsecond":
                        finalNumber = initialNumber * 6.048e+11;
                        break;

                    case "millisecond":
                        finalNumber = initialNumber * 6.048e+8;
                        break;

                    case "second":
                        finalNumber = initialNumber * 604800.0d;
                        break;

                    case "minute":
                        finalNumber = initialNumber * 10080.0d;
                        break;

                    case "hour":
                        finalNumber = initialNumber * 168.0d;
                        break;

                    case "day":
                        finalNumber = initialNumber * 7.0d;
                        break;

                    case "month":
                        finalNumber = initialNumber * 0.230137d;
                        break;

                    case "year":
                        finalNumber = initialNumber * 0.0191781d;
                        break;

                    case "decade":
                        finalNumber = initialNumber * 0.00191781d;
                        break;

                    case "century":
                        finalNumber = initialNumber * 0.000191781d;
                }
            }
            break;

            case "month": {
                switch (to) {
                    case "nanosecond":
                        finalNumber = initialNumber * 2.628e+15;
                        break;

                    case "microsecond":
                        finalNumber = initialNumber * 2.628e+12;
                        break;

                    case "millisecond":
                        finalNumber = initialNumber * 2.628e+9;
                        break;

                    case "second":
                        finalNumber = initialNumber * 2.628e+6;
                        break;

                    case "minute":
                        finalNumber = initialNumber * 43800.0d;
                        break;

                    case "hour":
                        finalNumber = initialNumber * 730.001d;
                        break;

                    case "day":
                        finalNumber = initialNumber * 30.4167d;
                        break;

                    case "week":
                        finalNumber = initialNumber * 4.34524d;
                        break;

                    case "year":
                        finalNumber = initialNumber * 0.0833334d;
                        break;

                    case "decade":
                        finalNumber = initialNumber * 0.00833334d;
                        break;

                    case "century":
                        finalNumber = initialNumber * 0.000833334d;
                }
            }
            break;

            case "year": {
                switch (to) {
                    case "nanosecond":
                        finalNumber = initialNumber * 3.154e+16;
                        break;

                    case "microsecond":
                        finalNumber = initialNumber * 3.154e+13;
                        break;

                    case "millisecond":
                        finalNumber = initialNumber * 3.154e+10;
                        break;

                    case "second":
                        finalNumber = initialNumber * 3.154e+7;
                        break;

                    case "minute":
                        finalNumber = initialNumber * 525600.0d;
                        break;

                    case "hour":
                        finalNumber = initialNumber * 8760.0d;
                        break;

                    case "day":
                        finalNumber = initialNumber * 365.0d;
                        break;

                    case "week":
                        finalNumber = initialNumber * 52.1429d;
                        break;

                    case "month":
                        finalNumber = initialNumber * 12.0d;
                        break;

                    case "decade":
                        finalNumber = initialNumber * 0.1d;
                        break;

                    case "century":
                        finalNumber = initialNumber * 0.01d;
                }
            }
            break;

            case "decade": {
                switch (to) {
                    case "nanosecond":
                        finalNumber = initialNumber * 3.154e+17;
                        break;

                    case "microsecond":
                        finalNumber = initialNumber * 3.154e+14;
                        break;

                    case "millisecond":
                        finalNumber = initialNumber * 3.154e+11;
                        break;

                    case "second":
                        finalNumber = initialNumber * 3.154e+8;
                        break;

                    case "minute":
                        finalNumber = initialNumber * 5.256e+6;
                        break;

                    case "hour":
                        finalNumber = initialNumber * 87600.0d;
                        break;

                    case "day":
                        finalNumber = initialNumber * 3650.0d;
                        break;

                    case "week":
                        finalNumber = initialNumber * 521.429d;
                        break;

                    case "month":
                        finalNumber = initialNumber * 120.0d;
                        break;

                    case "year":
                        finalNumber = initialNumber * 10.0d;
                        break;

                    case "century":
                        finalNumber = initialNumber * 0.1d;
                }
            }
            break;

            case "century": {
                switch (to) {
                    case "nanosecond":
                        finalNumber = initialNumber * 3.154e+18;
                        break;

                    case "microsecond":
                        finalNumber = initialNumber * 3.154e+15;
                        break;

                    case "millisecond":
                        finalNumber = initialNumber * 3.154e+12;
                        break;

                    case "second":
                        finalNumber = initialNumber * 3.154e+9;
                        break;

                    case "minute":
                        finalNumber = initialNumber * 5.256e+7;
                        break;

                    case "hour":
                        finalNumber = initialNumber * 876000.0d;
                        break;

                    case "day":
                        finalNumber = initialNumber * 36500.0d;
                        break;

                    case "week":
                        finalNumber = initialNumber * 5214.29d;
                        break;

                    case "month":
                        finalNumber = initialNumber * 1200.0d;
                        break;

                    case "year":
                        finalNumber = initialNumber * 100.0d;
                        break;

                    case "decade":
                        finalNumber = initialNumber * 10.0d;
                }
            }
            break;
        }

        return finalNumber;
    }

    public double volumeConvert(double fromNumber, String fromUnit, String toUnit) {
        double initialNumber = fromNumber;
        double finalNumber = 0.0d;

        String from = fromUnit.toLowerCase();
        String to = toUnit.toLowerCase();

        switch (from) {
            case "us liquid gallon": {
                switch (to) {
                    case "us liquid quart":
                        finalNumber = initialNumber * 4.0d;
                        break;

                    case "us liquid pint":
                        finalNumber = initialNumber * 8.0d;
                        break;

                    case "us legal cup":
                        finalNumber = initialNumber * 15.7725d;
                        break;

                    case "us fluid ounce":
                        finalNumber = initialNumber * 128.0d;
                        break;

                    case "us tablespoon":
                        finalNumber = initialNumber * 256.0d;
                        break;

                    case "us teaspoon":
                        finalNumber = initialNumber * 768.0d;
                        break;

                    case "cubic metre":
                        finalNumber = initialNumber * 0.00378541d;
                        break;

                    case "litre":
                        finalNumber = initialNumber * 3.78541d;
                        break;

                    case "millilitre":
                        finalNumber = initialNumber * 3785.41d;
                        break;

                    case "imperial gallon":
                        finalNumber = initialNumber * 0.832674d;
                        break;

                    case "imperial quart":
                        finalNumber = initialNumber * 3.3307d;
                        break;

                    case "imperial pint":
                        finalNumber = initialNumber * 6.66139d;
                        break;

                    case "imperial cup":
                        finalNumber = initialNumber * 13.3228d;
                        break;

                    case "imperial fluid ounce":
                        finalNumber = initialNumber * 133.228d;
                        break;

                    case "imperial tablespoon":
                        finalNumber = initialNumber * 213.165d;
                        break;

                    case "imperial teaspoon":
                        finalNumber = initialNumber * 639.494d;
                        break;

                    case "cubic foot":
                        finalNumber = initialNumber * 0.133681d;
                        break;

                    case "cubic inch":
                        finalNumber = initialNumber * 231.0d;
                        break;
                }
            }
            break;

            case "us liquid quart": {
                switch (to) {
                    case "us liquid gallon":
                        finalNumber = initialNumber * 0.25d;
                        break;

                    case "us liquid pint":
                        finalNumber = initialNumber * 2.0d;
                        break;

                    case "us legal cup":
                        finalNumber = initialNumber * 3.94314d;
                        break;

                    case "us fluid ounce":
                        finalNumber = initialNumber * 32.0d;
                        break;

                    case "us tablespoon":
                        finalNumber = initialNumber * 64.0d;
                        break;

                    case "us teaspoon":
                        finalNumber = initialNumber * 192.0d;
                        break;

                    case "cubic metre":
                        finalNumber = initialNumber * 0.000946353d;
                        break;

                    case "litre":
                        finalNumber = initialNumber * 0.946353d;
                        break;

                    case "millilitre":
                        finalNumber = initialNumber * 946.353d;
                        break;

                    case "imperial gallon":
                        finalNumber = initialNumber * 0.208169d;
                        break;

                    case "imperial quart":
                        finalNumber = initialNumber * 0.832674d;
                        break;

                    case "imperial pint":
                        finalNumber = initialNumber * 1.66535d;
                        break;

                    case "imperial cup":
                        finalNumber = initialNumber * 3.3307d;
                        break;

                    case "imperial fluid ounce":
                        finalNumber = initialNumber * 33.307d;
                        break;

                    case "imperial tablespoon":
                        finalNumber = initialNumber * 53.2911d;
                        break;

                    case "imperial teaspoon":
                        finalNumber = initialNumber * 159.873d;
                        break;

                    case "cubic foot":
                        finalNumber = initialNumber * 0.0334201d;
                        break;

                    case "cubic inch":
                        finalNumber = initialNumber * 57.75d;
                        break;
                }
            }
            break;

            case "us liquid pint": {
                switch (to) {
                    case "us liquid gallon":
                        finalNumber = initialNumber * 0.125d;
                        break;

                    case "us liquid quart":
                        finalNumber = initialNumber * 0.5d;
                        break;

                    case "us legal cup":
                        finalNumber = initialNumber * 1.97157d;
                        break;

                    case "us fluid ounce":
                        finalNumber = initialNumber * 16.0d;
                        break;

                    case "us tablespoon":
                        finalNumber = initialNumber * 32.0d;
                        break;

                    case "us teaspoon":
                        finalNumber = initialNumber * 96.0d;
                        break;

                    case "cubic metre":
                        finalNumber = initialNumber * 0.000473176d;
                        break;

                    case "litre":
                        finalNumber = initialNumber * 0.473176d;
                        break;

                    case "millilitre":
                        finalNumber = initialNumber * 473.176d;
                        break;

                    case "imperial gallon":
                        finalNumber = initialNumber * 0.104084d;
                        break;

                    case "imperial quart":
                        finalNumber = initialNumber * 0.416337d;
                        break;

                    case "imperial pint":
                        finalNumber = initialNumber * 0.832674d;
                        break;

                    case "imperial cup":
                        finalNumber = initialNumber * 1.66535d;
                        break;

                    case "imperial fluid ounce":
                        finalNumber = initialNumber * 16.6535d;
                        break;

                    case "imperial tablespoon":
                        finalNumber = initialNumber * 26.6456d;
                        break;

                    case "imperial teaspoon":
                        finalNumber = initialNumber * 79.9367d;
                        break;

                    case "cubic foot":
                        finalNumber = initialNumber * 0.0167101d;
                        break;

                    case "cubic inch":
                        finalNumber = initialNumber * 28.875d;
                        break;
                }
            }
            break;

            case "us legal cup": {
                switch (to) {
                    case "us liquid gallon":
                        finalNumber = initialNumber * 0.0634013d;
                        break;

                    case "us liquid quart":
                        finalNumber = initialNumber * 0.253605d;
                        break;

                    case "us liquid pint":
                        finalNumber = initialNumber * 0.50721d;
                        break;

                    case "us fluid ounce":
                        finalNumber = initialNumber * 8.11537d;
                        break;

                    case "us tablespoon":
                        finalNumber = initialNumber * 16.2307d;
                        break;

                    case "us teaspoon":
                        finalNumber = initialNumber * 48.6922d;
                        break;

                    case "cubic metre":
                        finalNumber = initialNumber * 0.00024d;
                        break;

                    case "litre":
                        finalNumber = initialNumber * 0.24d;
                        break;

                    case "millilitre":
                        finalNumber = initialNumber * 240.0d;
                        break;

                    case "imperial gallon":
                        finalNumber = initialNumber * 0.0527926d;
                        break;

                    case "imperial quart":
                        finalNumber = initialNumber * 0.21117d;
                        break;

                    case "imperial pint":
                        finalNumber = initialNumber * 0.422341d;
                        break;

                    case "imperial cup":
                        finalNumber = initialNumber * 0.844682d;
                        break;

                    case "imperial fluid ounce":
                        finalNumber = initialNumber * 8.44682d;
                        break;

                    case "imperial tablespoon":
                        finalNumber = initialNumber * 13.5149d;
                        break;

                    case "imperial teaspoon":
                        finalNumber = initialNumber * 40.5447d;
                        break;

                    case "cubic foot":
                        finalNumber = initialNumber * 0.00847552d;
                        break;

                    case "cubic inch":
                        finalNumber = initialNumber * 14.6457d;
                        break;
                }
            }
            break;

            case "us fluid ounce": {
                switch (to) {
                    case "us liquid gallon":
                        finalNumber = initialNumber * 0.0078125d;
                        break;

                    case "us liquid quart":
                        finalNumber = initialNumber * 0.03125d;
                        break;

                    case "us liquid pint":
                        finalNumber = initialNumber * 0.0625d;
                        break;

                    case "us legal cup":
                        finalNumber = initialNumber * 0.123223d;
                        break;

                    case "us tablespoon":
                        finalNumber = initialNumber * 2.0d;
                        break;

                    case "us teaspoon":
                        finalNumber = initialNumber * 6.0d;
                        break;

                    case "cubic metre":
                        finalNumber = initialNumber * 2.9574e-5;
                        break;

                    case "litre":
                        finalNumber = initialNumber * 0.0295735d;
                        break;

                    case "millilitre":
                        finalNumber = initialNumber * 29.5735d;
                        break;

                    case "imperial gallon":
                        finalNumber = initialNumber * 0.00650527d;
                        break;

                    case "imperial quart":
                        finalNumber = initialNumber * 0.0260211d;
                        break;

                    case "imperial pint":
                        finalNumber = initialNumber * 0.0520421d;
                        break;

                    case "imperial cup":
                        finalNumber = initialNumber * 0.104084d;
                        break;

                    case "imperial fluid ounce":
                        finalNumber = initialNumber * 1.04084d;
                        break;

                    case "imperial tablespoon":
                        finalNumber = initialNumber * 1.66535d;
                        break;

                    case "imperial teaspoon":
                        finalNumber = initialNumber * 4.99604d;
                        break;

                    case "cubic foot":
                        finalNumber = initialNumber * 0.00104438d;
                        break;

                    case "cubic inch":
                        finalNumber = initialNumber * 1.80469d;
                        break;
                }
            }
            break;

            case "us tablespoon": {
                switch (to) {
                    case "us liquid gallon":
                        finalNumber = initialNumber * 0.00390625d;
                        break;

                    case "us liquid quart":
                        finalNumber = initialNumber * 0.015625d;
                        break;

                    case "us liquid pint":
                        finalNumber = initialNumber * 0.03125d;
                        break;

                    case "us legal cup":
                        finalNumber = initialNumber * 0.0616115d;
                        break;

                    case "us fluid ounce":
                        finalNumber = initialNumber * 0.5d;
                        break;

                    case "us teaspoon":
                        finalNumber = initialNumber * 3.0d;
                        break;

                    case "cubic metre":
                        finalNumber = initialNumber * 1.4787e-5;
                        break;

                    case "litre":
                        finalNumber = initialNumber * 0.0147868d;
                        break;

                    case "millilitre":
                        finalNumber = initialNumber * 14.7868d;
                        break;

                    case "imperial gallon":
                        finalNumber = initialNumber * 0.00325263d;
                        break;

                    case "imperial quart":
                        finalNumber = initialNumber * 0.0130105d;
                        break;

                    case "imperial pint":
                        finalNumber = initialNumber * 0.0260211d;
                        break;

                    case "imperial cup":
                        finalNumber = initialNumber * 0.0520421d;
                        break;

                    case "imperial fluid ounce":
                        finalNumber = initialNumber * 0.520421d;
                        break;

                    case "imperial tablespoon":
                        finalNumber = initialNumber * 0.832674d;
                        break;

                    case "imperial teaspoon":
                        finalNumber = initialNumber * 2.49802d;
                        break;

                    case "cubic foot":
                        finalNumber = initialNumber * 0.00052219d;
                        break;

                    case "cubic inch":
                        finalNumber = initialNumber * 0.902344d;
                        break;
                }
            }
            break;

            case "us teaspoon": {
                switch (to) {
                    case "us liquid gallon":
                        finalNumber = initialNumber * 0.00130208d;
                        break;

                    case "us liquid quart":
                        finalNumber = initialNumber * 0.00520833d;
                        break;

                    case "us liquid pint":
                        finalNumber = initialNumber * 0.0104167d;
                        break;

                    case "us legal cup":
                        finalNumber = initialNumber * 0.0205372d;
                        break;

                    case "us fluid ounce":
                        finalNumber = initialNumber * 0.166667d;
                        break;

                    case "us tablespoon":
                        finalNumber = initialNumber * 0.333333d;
                        break;

                    case "cubic metre":
                        finalNumber = initialNumber * 4.9289e-6;
                        break;

                    case "litre":
                        finalNumber = initialNumber * 0.00492892d;
                        break;

                    case "millilitre":
                        finalNumber = initialNumber * 4.92892d;
                        break;

                    case "imperial gallon":
                        finalNumber = initialNumber * 0.00108421d;
                        break;

                    case "imperial quart":
                        finalNumber = initialNumber * 0.00433684d;
                        break;

                    case "imperial pint":
                        finalNumber = initialNumber * 0.00867369d;
                        break;

                    case "imperial cup":
                        finalNumber = initialNumber * 0.0173474d;
                        break;

                    case "imperial fluid ounce":
                        finalNumber = initialNumber * 0.173474d;
                        break;

                    case "imperial tablespoon":
                        finalNumber = initialNumber * 0.277558d;
                        break;

                    case "imperial teaspoon":
                        finalNumber = initialNumber * 0.832674d;
                        break;

                    case "cubic foot":
                        finalNumber = initialNumber * 0.000174063d;
                        break;

                    case "cubic inch":
                        finalNumber = initialNumber * 0.300781d;
                        break;
                }
            }
            break;

            case "cubic metre": {
                switch (to) {
                    case "us liquid gallon":
                        finalNumber = initialNumber * 264.172d;
                        break;

                    case "us liquid quart":
                        finalNumber = initialNumber * 1056.69d;
                        break;

                    case "us liquid pint":
                        finalNumber = initialNumber * 2113.38d;
                        break;

                    case "us legal cup":
                        finalNumber = initialNumber * 4166.67d;
                        break;

                    case "us fluid ounce":
                        finalNumber = initialNumber * 33814.0d;
                        break;

                    case "us tablespoon":
                        finalNumber = initialNumber * 67628.0d;
                        break;

                    case "us teaspoon":
                        finalNumber = initialNumber * 202884.0d;
                        break;

                    case "litre":
                        finalNumber = initialNumber * 1000.0d;
                        break;

                    case "millilitre":
                        finalNumber = initialNumber * 1e+6;
                        break;

                    case "imperial gallon":
                        finalNumber = initialNumber * 219.969d;
                        break;

                    case "imperial quart":
                        finalNumber = initialNumber * 879.877d;
                        break;

                    case "imperial pint":
                        finalNumber = initialNumber * 1759.75d;
                        break;

                    case "imperial cup":
                        finalNumber = initialNumber * 3519.51d;
                        break;

                    case "imperial fluid ounce":
                        finalNumber = initialNumber * 35195.1d;
                        break;

                    case "imperial tablespoon":
                        finalNumber = initialNumber * 56312.1d;
                        break;

                    case "imperial teaspoon":
                        finalNumber = initialNumber * 168936.0d;
                        break;

                    case "cubic foot":
                        finalNumber = initialNumber * 35.3147d;
                        break;

                    case "cubic inch":
                        finalNumber = initialNumber * 61023.7d;
                        break;
                }
            }
            break;

            case "litre": {
                switch (to) {
                    case "us liquid gallon":
                        finalNumber = initialNumber * 0.264172d;
                        break;

                    case "us liquid quart":
                        finalNumber = initialNumber * 1.05669d;
                        break;

                    case "us liquid pint":
                        finalNumber = initialNumber * 2.11338d;
                        break;

                    case "us legal cup":
                        finalNumber = initialNumber * 4.16667d;
                        break;

                    case "us fluid ounce":
                        finalNumber = initialNumber * 33.814d;
                        break;

                    case "us tablespoon":
                        finalNumber = initialNumber * 67.628d;
                        break;

                    case "us teaspoon":
                        finalNumber = initialNumber * 202.884d;
                        break;

                    case "cubic metre":
                        finalNumber = initialNumber * 0.001d;
                        break;

                    case "millilitre":
                        finalNumber = initialNumber * 1000.0d;
                        break;

                    case "imperial gallon":
                        finalNumber = initialNumber * 0.219969d;
                        break;

                    case "imperial quart":
                        finalNumber = initialNumber * 0.879877d;
                        break;

                    case "imperial pint":
                        finalNumber = initialNumber * 1.75975d;
                        break;

                    case "imperial cup":
                        finalNumber = initialNumber * 3.51951d;
                        break;

                    case "imperial fluid ounce":
                        finalNumber = initialNumber * 35.1951d;
                        break;

                    case "imperial tablespoon":
                        finalNumber = initialNumber * 56.3121d;
                        break;

                    case "imperial teaspoon":
                        finalNumber = initialNumber * 168.936d;
                        break;

                    case "cubic foot":
                        finalNumber = initialNumber * 0.0353147d;
                        break;

                    case "cubic inch":
                        finalNumber = initialNumber * 61.0237d;
                        break;
                }
            }
            break;

            case "millilitre": {
                switch (to) {
                    case "us liquid gallon":
                        finalNumber = initialNumber * 0.000264172d;
                        break;

                    case "us liquid quart":
                        finalNumber = initialNumber * 0.00105669d;
                        break;

                    case "us liquid pint":
                        finalNumber = initialNumber * 0.00211338d;
                        break;

                    case "us legal cup":
                        finalNumber = initialNumber * 0.00416667d;
                        break;

                    case "us fluid ounce":
                        finalNumber = initialNumber * 0.033814d;
                        break;

                    case "us tablespoon":
                        finalNumber = initialNumber * 0.067628d;
                        break;

                    case "us teaspoon":
                        finalNumber = initialNumber * 0.202884d;
                        break;

                    case "cubic metre":
                        finalNumber = initialNumber * 1e-6;
                        break;

                    case "litre":
                        finalNumber = initialNumber * 0.001d;
                        break;

                    case "imperial gallon":
                        finalNumber = initialNumber * 0.000219969d;
                        break;

                    case "imperial quart":
                        finalNumber = initialNumber * 0.000879877d;
                        break;

                    case "imperial pint":
                        finalNumber = initialNumber * 0.00175975d;
                        break;

                    case "imperial cup":
                        finalNumber = initialNumber * 0.00351951d;
                        break;

                    case "imperial fluid ounce":
                        finalNumber = initialNumber * 0.0351951d;
                        break;

                    case "imperial tablespoon":
                        finalNumber = initialNumber * 0.0563121d;
                        break;

                    case "imperial teaspoon":
                        finalNumber = initialNumber * 0.168936d;
                        break;

                    case "cubic foot":
                        finalNumber = initialNumber * 3.5315e-5;
                        break;

                    case "cubic inch":
                        finalNumber = initialNumber * 0.0610237d;
                        break;
                }
            }
            break;

            case "imperial gallon": {
                switch (to) {
                    case "us liquid gallon":
                        finalNumber = initialNumber * 1.20095d;
                        break;

                    case "us liquid quart":
                        finalNumber = initialNumber * 4.8038d;
                        break;

                    case "us liquid pint":
                        finalNumber = initialNumber * 9.6076d;
                        break;

                    case "us legal cup":
                        finalNumber = initialNumber * 18.942d;
                        break;

                    case "us fluid ounce":
                        finalNumber = initialNumber * 153.722d;
                        break;

                    case "us tablespoon":
                        finalNumber = initialNumber * 307.443d;
                        break;

                    case "us teaspoon":
                        finalNumber = initialNumber * 922.33d;
                        break;

                    case "cubic metre":
                        finalNumber = initialNumber * 0.00454609d;
                        break;

                    case "litre":
                        finalNumber = initialNumber * 4.54609d;
                        break;

                    case "millilitre":
                        finalNumber = initialNumber * 4546.09d;
                        break;

                    case "imperial quart":
                        finalNumber = initialNumber * 4.0d;
                        break;

                    case "imperial pint":
                        finalNumber = initialNumber * 8.0d;
                        break;

                    case "imperial cup":
                        finalNumber = initialNumber * 16.0d;
                        break;

                    case "imperial fluid ounce":
                        finalNumber = initialNumber * 160.0d;
                        break;

                    case "imperial tablespoon":
                        finalNumber = initialNumber * 256.0d;
                        break;

                    case "imperial teaspoon":
                        finalNumber = initialNumber * 768.0d;
                        break;

                    case "cubic foot":
                        finalNumber = initialNumber * 0.160544d;
                        break;

                    case "cubic inch":
                        finalNumber = initialNumber * 277.419d;
                        break;
                }
            }
            break;

            case "imperial quart": {
                switch (to) {
                    case "us liquid gallon":
                        finalNumber = initialNumber * 0.300237d;
                        break;

                    case "us liquid quart":
                        finalNumber = initialNumber * 1.20095d;
                        break;

                    case "us liquid pint":
                        finalNumber = initialNumber * 2.4019d;
                        break;

                    case "us legal cup":
                        finalNumber = initialNumber * 4.73551d;
                        break;

                    case "us fluid ounce":
                        finalNumber = initialNumber * 38.4304d;
                        break;

                    case "us tablespoon":
                        finalNumber = initialNumber * 76.8608d;
                        break;

                    case "us teaspoon":
                        finalNumber = initialNumber * 230.582d;
                        break;

                    case "cubic metre":
                        finalNumber = initialNumber * 0.00113652d;
                        break;

                    case "litre":
                        finalNumber = initialNumber * 1.13652d;
                        break;

                    case "millilitre":
                        finalNumber = initialNumber * 1136.52d;
                        break;

                    case "imperial gallon":
                        finalNumber = initialNumber * 0.25d;
                        break;

                    case "imperial pint":
                        finalNumber = initialNumber * 2.0d;
                        break;

                    case "imperial cup":
                        finalNumber = initialNumber * 4.0d;
                        break;

                    case "imperial fluid ounce":
                        finalNumber = initialNumber * 40.0d;
                        break;

                    case "imperial tablespoon":
                        finalNumber = initialNumber * 64.0d;
                        break;

                    case "imperial teaspoon":
                        finalNumber = initialNumber * 192.0d;
                        break;

                    case "cubic foot":
                        finalNumber = initialNumber * 0.0401359d;
                        break;

                    case "cubic inch":
                        finalNumber = initialNumber * 69.3549d;
                        break;
                }
            }
            break;

            case "imperial pint": {
                switch (to) {
                    case "us liquid gallon":
                        finalNumber = initialNumber * 0.150119d;
                        break;

                    case "us liquid quart":
                        finalNumber = initialNumber * 0.600475d;
                        break;

                    case "us liquid pint":
                        finalNumber = initialNumber * 1.20095d;
                        break;

                    case "us legal cup":
                        finalNumber = initialNumber * 2.36776d;
                        break;

                    case "us fluid ounce":
                        finalNumber = initialNumber * 19.2152d;
                        break;

                    case "us tablespoon":
                        finalNumber = initialNumber * 38.4304d;
                        break;

                    case "us teaspoon":
                        finalNumber = initialNumber * 115.291d;
                        break;

                    case "cubic metre":
                        finalNumber = initialNumber * 0.000568261d;
                        break;

                    case "litre":
                        finalNumber = initialNumber * 0.568261d;
                        break;

                    case "millilitre":
                        finalNumber = initialNumber * 568.261d;
                        break;

                    case "imperial gallon":
                        finalNumber = initialNumber * 0.125d;
                        break;

                    case "imperial quart":
                        finalNumber = initialNumber * 0.5d;
                        break;

                    case "imperial cup":
                        finalNumber = initialNumber * 2.0d;
                        break;

                    case "imperial fluid ounce":
                        finalNumber = initialNumber * 20.0d;
                        break;

                    case "imperial tablespoon":
                        finalNumber = initialNumber * 32.0d;
                        break;

                    case "imperial teaspoon":
                        finalNumber = initialNumber * 96.0d;
                        break;

                    case "cubic foot":
                        finalNumber = initialNumber * 0.020068d;
                        break;

                    case "cubic inch":
                        finalNumber = initialNumber * 34.6774d;
                        break;
                }
            }
            break;

            case "imperial cup": {
                switch (to) {
                    case "us liquid gallon":
                        finalNumber = initialNumber * 0.0750594d;
                        break;

                    case "us liquid quart":
                        finalNumber = initialNumber * 0.300237d;
                        break;

                    case "us liquid pint":
                        finalNumber = initialNumber * 0.600475d;
                        break;

                    case "us legal cup":
                        finalNumber = initialNumber * 1.18388d;
                        break;

                    case "us fluid ounce":
                        finalNumber = initialNumber * 9.6076d;
                        break;

                    case "us tablespoon":
                        finalNumber = initialNumber * 19.2152d;
                        break;

                    case "us teaspoon":
                        finalNumber = initialNumber * 57.6456d;
                        break;

                    case "cubic metre":
                        finalNumber = initialNumber * 0.000284131d;
                        break;

                    case "litre":
                        finalNumber = initialNumber * 0.284131d;
                        break;

                    case "millilitre":
                        finalNumber = initialNumber * 284.131d;
                        break;

                    case "imperial gallon":
                        finalNumber = initialNumber * 0.0625d;
                        break;

                    case "imperial quart":
                        finalNumber = initialNumber * 0.25d;
                        break;

                    case "imperial pint":
                        finalNumber = initialNumber * 0.5d;
                        break;

                    case "imperial fluid ounce":
                        finalNumber = initialNumber * 10.0d;
                        break;

                    case "imperial tablespoon":
                        finalNumber = initialNumber * 16.0d;
                        break;

                    case "imperial teaspoon":
                        finalNumber = initialNumber * 48.0d;
                        break;

                    case "cubic foot":
                        finalNumber = initialNumber * 0.010034d;
                        break;

                    case "cubic inch":
                        finalNumber = initialNumber * 17.3387d;
                        break;
                }
            }
            break;

            case "imperial fluid ounce": {
                switch (to) {
                    case "us liquid gallon":
                        finalNumber = initialNumber * 0.00750594d;
                        break;

                    case "us liquid quart":
                        finalNumber = initialNumber * 0.0300237d;
                        break;

                    case "us liquid pint":
                        finalNumber = initialNumber * 0.0600475d;
                        break;

                    case "us legal cup":
                        finalNumber = initialNumber * 0.118388d;
                        break;

                    case "us fluid ounce":
                        finalNumber = initialNumber * 0.96076d;
                        break;

                    case "us tablespoon":
                        finalNumber = initialNumber * 1.92152d;
                        break;

                    case "us teaspoon":
                        finalNumber = initialNumber * 5.76456d;
                        break;

                    case "cubic metre":
                        finalNumber = initialNumber * 2.8413e-5;
                        break;

                    case "litre":
                        finalNumber = initialNumber * 0.0284131d;
                        break;

                    case "millilitre":
                        finalNumber = initialNumber * 28.4131d;
                        break;

                    case "imperial gallon":
                        finalNumber = initialNumber * 0.00625d;
                        break;

                    case "imperial quart":
                        finalNumber = initialNumber * 0.025d;
                        break;

                    case "imperial pint":
                        finalNumber = initialNumber * 0.05d;
                        break;

                    case "imperial cup":
                        finalNumber = initialNumber * 0.1d;
                        break;

                    case "imperial tablespoon":
                        finalNumber = initialNumber * 1.6d;
                        break;

                    case "imperial teaspoon":
                        finalNumber = initialNumber * 4.8d;
                        break;

                    case "cubic foot":
                        finalNumber = initialNumber * 0.0010034d;
                        break;

                    case "cubic inch":
                        finalNumber = initialNumber * 1.73387d;
                        break;
                }
            }
            break;

            case "imperial tablespoon": {
                switch (to) {
                    case "us liquid gallon":
                        finalNumber = initialNumber * 0.00469121d;
                        break;

                    case "us liquid quart":
                        finalNumber = initialNumber * 0.0187649d;
                        break;

                    case "us liquid pint":
                        finalNumber = initialNumber * 0.0375297d;
                        break;

                    case "us legal cup":
                        finalNumber = initialNumber * 0.0739924d;
                        break;

                    case "us fluid ounce":
                        finalNumber = initialNumber * 0.600475d;
                        break;

                    case "us tablespoon":
                        finalNumber = initialNumber * 1.20095d;
                        break;

                    case "us teaspoon":
                        finalNumber = initialNumber * 3.60285d;
                        break;

                    case "cubic metre":
                        finalNumber = initialNumber * 1.7758e-5;
                        break;

                    case "litre":
                        finalNumber = initialNumber * 0.0177582d;
                        break;

                    case "millilitre":
                        finalNumber = initialNumber * 17.7582d;
                        break;

                    case "imperial gallon":
                        finalNumber = initialNumber * 0.00390625d;
                        break;

                    case "imperial quart":
                        finalNumber = initialNumber * 0.015625d;
                        break;

                    case "imperial pint":
                        finalNumber = initialNumber * 0.03125d;
                        break;

                    case "imperial cup":
                        finalNumber = initialNumber * 0.0625d;
                        break;

                    case "imperial fluid ounce":
                        finalNumber = initialNumber * 0.625d;
                        break;

                    case "imperial teaspoon":
                        finalNumber = initialNumber * 3.0d;
                        break;

                    case "cubic foot":
                        finalNumber = initialNumber * 0.000627124d;
                        break;

                    case "cubic inch":
                        finalNumber = initialNumber * 1.08367d;
                        break;
                }
            }
            break;

            case "imperial teaspoon": {
                switch (to) {
                    case "us liquid gallon":
                        finalNumber = initialNumber * 0.00156374d;
                        break;

                    case "us liquid quart":
                        finalNumber = initialNumber * 0.00625495d;
                        break;

                    case "us liquid pint":
                        finalNumber = initialNumber * 0.0125099d;
                        break;

                    case "us legal cup":
                        finalNumber = initialNumber * 0.0246641d;
                        break;

                    case "us fluid ounce":
                        finalNumber = initialNumber * 0.200158d;
                        break;

                    case "us tablespoon":
                        finalNumber = initialNumber * 0.400317d;
                        break;

                    case "us teaspoon":
                        finalNumber = initialNumber * 1.20095d;
                        break;

                    case "cubic metre":
                        finalNumber = initialNumber * 5.9194e-6;
                        break;

                    case "litre":
                        finalNumber = initialNumber * 0.00591939d;
                        break;

                    case "millilitre":
                        finalNumber = initialNumber * 5.91939d;
                        break;

                    case "imperial gallon":
                        finalNumber = initialNumber * 0.00130208d;
                        break;

                    case "imperial quart":
                        finalNumber = initialNumber * 0.00520834d;
                        break;

                    case "imperial pint":
                        finalNumber = initialNumber * 0.0104167d;
                        break;

                    case "imperial cup":
                        finalNumber = initialNumber * 0.0208333d;
                        break;

                    case "imperial fluid ounce":
                        finalNumber = initialNumber * 0.208333d;
                        break;

                    case "imperial tablespoon":
                        finalNumber = initialNumber * 0.333333d;
                        break;

                    case "cubic foot":
                        finalNumber = initialNumber * 0.000209041d;
                        break;

                    case "cubic inch":
                        finalNumber = initialNumber * 0.361223d;
                        break;
                }
            }
            break;

            case "cubic foot": {
                switch (to) {
                    case "us liquid gallon":
                        finalNumber = initialNumber * 7.48052d;
                        break;

                    case "us liquid quart":
                        finalNumber = initialNumber * 29.9221d;
                        break;

                    case "us liquid pint":
                        finalNumber = initialNumber * 59.8442d;
                        break;

                    case "us legal cup":
                        finalNumber = initialNumber * 117.987d;
                        break;

                    case "us fluid ounce":
                        finalNumber = initialNumber * 957.506d;
                        break;

                    case "us tablespoon":
                        finalNumber = initialNumber * 1915.01d;
                        break;

                    case "us teaspoon":
                        finalNumber = initialNumber * 5745.04d;
                        break;

                    case "cubic metre":
                        finalNumber = initialNumber * 0.0283168d;
                        break;

                    case "litre":
                        finalNumber = initialNumber * 28.3168d;
                        break;

                    case "millilitre":
                        finalNumber = initialNumber * 28316.8d;
                        break;

                    case "imperial gallon":
                        finalNumber = initialNumber * 6.22884d;
                        break;

                    case "imperial quart":
                        finalNumber = initialNumber * 24.9153d;
                        break;

                    case "imperial pint":
                        finalNumber = initialNumber * 49.8307d;
                        break;

                    case "imperial cup":
                        finalNumber = initialNumber * 99.6614d;
                        break;

                    case "imperial fluid ounce":
                        finalNumber = initialNumber * 996.614d;
                        break;

                    case "imperial tablespoon":
                        finalNumber = initialNumber * 1594.58d;
                        break;

                    case "imperial teaspoon":
                        finalNumber = initialNumber * 4783.74d;
                        break;

                    case "cubic inch":
                        finalNumber = initialNumber * 1728.0d;
                        break;
                }
            }
            break;

            case "cubic inch": {
                switch (to) {
                    case "us liquid gallon":
                        finalNumber = initialNumber * 0.004329d;
                        break;

                    case "us liquid quart":
                        finalNumber = initialNumber * 0.017316d;
                        break;

                    case "us liquid pint":
                        finalNumber = initialNumber * 0.034632d;
                        break;

                    case "us legal cup":
                        finalNumber = initialNumber * 0.0682794d;
                        break;

                    case "us fluid ounce":
                        finalNumber = initialNumber * 0.554113d;
                        break;

                    case "us tablespoon":
                        finalNumber = initialNumber * 1.10823d;
                        break;

                    case "us teaspoon":
                        finalNumber = initialNumber * 3.32468d;
                        break;

                    case "cubic metre":
                        finalNumber = initialNumber * 1.6387e-5;
                        break;

                    case "litre":
                        finalNumber = initialNumber * 0.0163871d;
                        break;

                    case "millilitre":
                        finalNumber = initialNumber * 16.3871d;
                        break;

                    case "imperial gallon":
                        finalNumber = initialNumber * 0.00360465d;
                        break;

                    case "imperial quart":
                        finalNumber = initialNumber * 0.0144186d;
                        break;

                    case "imperial pint":
                        finalNumber = initialNumber * 0.0288372d;
                        break;

                    case "imperial cup":
                        finalNumber = initialNumber * 0.0576744d;
                        break;

                    case "imperial fluid ounce":
                        finalNumber = initialNumber * 0.576744d;
                        break;

                    case "imperial tablespoon":
                        finalNumber = initialNumber * 0.92279d;
                        break;

                    case "imperial teaspoon":
                        finalNumber = initialNumber * 2.76837d;
                        break;

                    case "cubic foot":
                        finalNumber = initialNumber * 0.000578704d;
                        break;
                }
            }
            break;
        }

        return finalNumber;
    }
}
