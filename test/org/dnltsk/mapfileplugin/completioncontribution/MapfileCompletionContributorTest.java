package org.dnltsk.mapfileplugin.completioncontribution;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class MapfileCompletionContributorTest {

    @Test
    public void generic_error_message_is_transformed_correctly() throws Exception {
        String genericErrorMessage = "MapfileTokenType.TEMPPATH, MapfileTokenType.VALIDATION or MapfileTokenType.end expected, got 'MapfileDummy'";

        MapfileCompletionContributor contributor = new MapfileCompletionContributor();

        String[] suggestedKeywords = contributor.extracKeywordsFromErrorDescription(genericErrorMessage);

        String[] expectedKeywords = (String[])Arrays.asList("TEMPPATH", "VALIDATION", "end").toArray();

        assertEquals(expectedKeywords, suggestedKeywords);
    }
}