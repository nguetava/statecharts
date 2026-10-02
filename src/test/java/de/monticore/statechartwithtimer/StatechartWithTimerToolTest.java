/* (c) https://github.com/MontiCore/monticore */
package de.monticore.statechartwithtimer;

import de.se_rwth.commons.logging.Log;
import de.se_rwth.commons.logging.LogStub;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Tests the generated tool API.
 */
public class StatechartWithTimerToolTest {
  
  @BeforeEach
  public void setUp() {
    StatechartWithTimerMill.reset();
    StatechartWithTimerMill.init();
    LogStub.init();
    Log.enableFailQuick(false);
    Log.getFindings().clear();
  }
  
  @Test
  public void testParseModel() {
    StatechartWithTimerTool tool = new StatechartWithTimerTool();
    
    assertNotNull(tool.parse("src/test/resources/statechartwithtimer/parser/TimerStatechart.sc"));
  }
  
}
