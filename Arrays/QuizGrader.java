public class QuizGrader {
    // Ito ang pangalan ng class ng ating quiz grading program.

    public static void main(String[] args) {
        // Ito ang main method kung saan nagsisimula ang program.

        char[] answerKey = {'A', 'C', 'B', 'D', 'A', 'C', 'C', 'B', 'A', 'D'};
        // Gumagawa ng char array na naglalaman ng mga tamang sagot sa 10 questions.

        char[] studentAnswers = {'A', 'B', 'B', 'D', 'C', 'C', 'C', 'B', 'A', 'A'};
        // Gumagawa ng pangalawang char array na naglalaman ng mga sagot ng estudyante.

        int correctCount = 0;
        // Gumagawa ng variable para bilangin ang tamang sagot, na nagsisimula sa 0.

        for (int i = 0; i < answerKey.length; i++) {
            // Gumagamit ng for loop para isa-isang suriin ang 10 questions.

            if (studentAnswers[i] == answerKey[i]) {
                // Sinusuri kung magkapareho ang sagot ng estudyante at ang answer key.

                correctCount++;
                // Dinadagdagan ng 1 ang correctCount kapag tama ang sagot.
            }
        }

        double scorePercentage = ((double) correctCount / answerKey.length) * 100;
        // Kinukuha ang percentage ng tamang sagot sa pamamagitan ng paghahati ng correctCount sa kabuuang questions at pag-multiply sa 100.
        // Ginagamit ang double para magkaroon ng tamang decimal calculation.

        System.out.println("--- Quiz Results ---");
        // Nagpi-print ng heading para sa resulta ng quiz.

        System.out.println("Correct Answers: " + correctCount + "/" + answerKey.length);
        // Ipinapakita ang bilang ng tamang sagot kumpara sa kabuuang questions.

        System.out.println("Score Percentage: " + scorePercentage + "%");
        // Ipinapakita ang percentage ng score ng estudyante.

        // 4. Pass/Fail Logic
        if (scorePercentage >= 70.0) {
            // Sinusuri kung ang percentage ng estudyante ay 70% pataas.

            System.out.println("Result: PASS");
            // Kapag 70% pataas, ipapakita na PASS.
        } else {
            // Kapag hindi umabot sa 70%, dito papasok ang program.

            System.out.println("Result: FAIL");
            // Ipapakita na FAIL ang resulta.
        }
    }
}