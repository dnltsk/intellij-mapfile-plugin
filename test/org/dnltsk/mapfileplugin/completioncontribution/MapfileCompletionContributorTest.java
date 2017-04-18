package org.dnltsk.mapfileplugin.completioncontribution;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class MapfileCompletionContributorTest {

    @Test
    public void generic_error_message_is_transformed_correctly() throws Exception {
        String genericErrorMessage = "MapfileTokenType.TEMPPATH, MapfileTokenType.VALIDATION or MapfileTokenType.end expected, got 'MapfileDummy'";

        MapfileCompletionContributor contributor = new MapfileCompletionContributor();

        String[] suggestedTokens = contributor.extractTokensFromErrorDescription(genericErrorMessage);

        String[] expectedTokens = (String[])Arrays.asList("TEMPPATH", "VALIDATION", "end").toArray();

        assertEquals(expectedTokens, suggestedTokens);
    }
}