package com.wci.terminology.api;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Test;
import com.wci.terminology.api.TerminologyApi;
import com.wci.terminology.client.model.Concept;
import com.wci.terminology.client.model.Terminology;

public class TerminologyApiTest {

    private final TerminologyApi api = new TerminologyApi();
    { api.getApiClient().setBasePath("https://snomed.westcoastinformatics.com"); }

    @Test
    public void getTerminologiesTest() throws Exception {
        final List<Terminology> terms = api.getTerminologies();
        assertNotNull(terms);
        assertFalse(terms.isEmpty());
    }

    @Test
    public void getConceptTest() throws Exception {
        final Concept concept = api.getConcept("SNOMEDCT_US", "71388002", null);
        assertNotNull(concept);
        assertNotNull(concept.getCode());
    }

    @Test
    public void getTerminologyTest() throws Exception {
        final Terminology terminology = api.getTerminology("SNOMEDCT_US");
        assertNotNull(terminology);
        assertNotNull(terminology.getName());
    }

    @Test
    public void findConceptsGlobalTest() throws Exception {
        final String query = "heart";
        final Integer limit = 5;
        assertNotNull(api.findConcepts(query, 0, limit, true, null, null, null, null, null));
    }

    @Test
    public void findConceptsByTerminologyTest() throws Exception {
        final String terminology = "SNOMEDCT_US";
        final String query = "heart";
        final Integer limit = 5;
        assertNotNull(api.findConcepts1(terminology, query, null, 0, limit, true, null, null, null, null, null));
    }

    @Test
    public void getConceptRelationshipsTest() throws Exception {
        final String terminology = "SNOMEDCT_US";
        final String code = "71388002";
        assertNotNull(api.getRelationships(terminology, code, 0, 5, true, null, null, null, null));
    }

    @Test
    public void getSubsetsAndSubsetTest() throws Exception {
        final String terminology = "SNOMEDCT_US";
        assertNotNull(api.getSubsets(terminology));
        final String code = "723264001";
        assertNotNull(api.getSubset(terminology, code));
    }

    @Test
    public void getSubtreeAndTreePositionsTest() throws Exception {
        final String terminology = "SNOMEDCT_US";
        final String code = "71388002";
        assertNotNull(api.getSubtree(terminology, code, 1, false));
        assertNotNull(api.findTreePositions(terminology, code, 0, 5, true, null, false));
        assertNotNull(api.findTreePositionChildren(terminology, code, 0, 5, true, null, false));
        assertNotNull(api.findTreePositionDescendants(terminology, code, 0, 5, true, null, false));
    }

    @Test
    public void resolveExpressionTest() throws Exception {
        final String terminology = "SNOMEDCT_US";
        final String expression = "<404684003";
        assertNotNull(api.resolveExpression(terminology, expression));
    }

    @Test
    public void getConfigPropertiesTest() throws Exception {
        assertNotNull(api.getConfigProperties());
    }

    @Test
    public void getConceptByCodeReadmeTest() throws Exception {
        final Concept concept = api.getConcept("SNOMEDCT_US", "80891009", null);
        assertNotNull(concept);
        assertNotNull(concept.getCode());
    }

    @Test
    public void getConceptRelationshipsByCodeReadmeTest() throws Exception {
        assertNotNull(api.getRelationships("SNOMEDCT_US", "80891009", 0, 5, true, null, null, null, null));
    }

    @Test
    public void findConceptsBySearchTermReadmeTest() throws Exception {
        assertNotNull(api.findConcepts1("SNOMEDCT_US", "melanoma", null, 0, 5, true, null, null, "MIN", null, null));
    }

    @Test
    public void findConceptsBySearchTermAndExpressionReadmeTest() throws Exception {
        assertNotNull(api.findConcepts1("SNOMEDCT_US", "melanoma", "<<363346000", 0, 5, true, null, null, "MIN", null, null));
    }

    @Test
    public void getSubtreeReadmeTest() throws Exception {
        assertNotNull(api.getSubtree("SNOMEDCT_US", "71388002", 3, false));
    }
}


