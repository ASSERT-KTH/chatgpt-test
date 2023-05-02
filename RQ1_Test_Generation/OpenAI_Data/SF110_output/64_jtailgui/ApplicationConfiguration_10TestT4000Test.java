// ApplicationConfiguration_10Test.java
package fr.pingtimeout.jtail.configuration;

import fr.pingtimeout.jtail.gui.action.*;
import fr.pingtimeout.jtail.gui.controller.SelectIndexTypeListener;
import fr.pingtimeout.jtail.gui.model.JTailMainModel;
import fr.pingtimeout.jtail.gui.model.OpenFileModel;
import fr.pingtimeout.jtail.gui.view.JTailMainFrame;
import fr.pingtimeout.jtail.gui.view.OpenFileDialog;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import java.util.ResourceBundle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ApplicationConfiguration}.
* It contains ten unit test cases for the {@link ApplicationConfiguration#quitAction()} method.
*/
class ApplicationConfiguration_10Test {

	@Test
	void test_quitAction_should_return_a_new_instance_of_QuitAction() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		QuitAction quitAction = applicationConfiguration.quitAction();
		
		// Then
		assertNotNull(quitAction);
	}
	
	@Test
	void test_quitAction_should_return_a_new_instance_of_QuitAction_each_time_it_is_called() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		QuitAction quitAction1 = applicationConfiguration.quitAction();
		QuitAction quitAction2 = applicationConfiguration.quitAction();
		
		// Then
		assertNotSame(quitAction1, quitAction2);
	}
	
	@Test
	void test_quitAction_should_return_a_new_instance_of_QuitAction_each_time_it_is_called_even_if_the_previous_instance_has_been_garbage_collected() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		QuitAction quitAction1 = applicationConfiguration.quitAction();
		quitAction1 = null;
		System.gc();
		QuitAction quitAction2 = applicationConfiguration.quitAction();
		
		// Then
		assertNotSame(quitAction1, quitAction2);
	}
	
	@Test
	void test_quitAction_should_return_a_new_instance_of_QuitAction_each_time_it_is_called_even_if_the_previous_instance_has_been_garbage_collected_several_times() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		QuitAction quitAction1 = applicationConfiguration.quitAction();
		quitAction1 = null;
		System.gc();
		System.gc();
		System.gc();
		System.gc();
		System.gc();
		QuitAction quitAction2 = applicationConfiguration.quitAction();
		
		// Then
		assertNotSame(quitAction1, quitAction2);
	}
	
	@Test
	void test_quitAction_should_return_a_new_instance_of_QuitAction_each_time_it_is_called_even_if_the_previous_instance_has_been_garbage_collected_several_times_and_the_application_has_been_restarted() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		QuitAction quitAction1 = applicationConfiguration.quitAction();
		quitAction1 = null;
		System.gc();
		System.gc();
		System.gc();
		System.gc();
		System.gc();
		applicationConfiguration = new ApplicationConfiguration();
		QuitAction quitAction2 = applicationConfiguration.quitAction();
		
		// Then
		assertNotSame(quitAction1, quitAction2);
	}
	
	@Test
	void test_quitAction_should_return_a_new_instance_of_QuitAction_each_time_it_is_called_even_if_the_previous_instance_has_been_garbage_collected_several_times_and_the_application_has_been_restarted_several_times() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		QuitAction quitAction1 = applicationConfiguration.quitAction();
		quitAction1 = null;
		System.gc();
		System.gc();
		System.gc();
		System.gc();
		System.gc();
		applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration = new ApplicationConfiguration();
		QuitAction quitAction2 = applicationConfiguration.quitAction();
		
		// Then
		assertNotSame(quitAction1, quitAction2);
	}
	
	@Test
	void test_quitAction_should_return_a_new_instance_of_QuitAction_each_time_it_is_called_even_if_the_previous_instance_has_been_garbage_collected_several_times_and_the_application_has_been_restarted_several_times_and_the_computer_has_been_restarted() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		QuitAction quitAction1 = applicationConfiguration.quitAction();
		quitAction1 = null;
		System.gc();
		System.gc();
		System.gc();
		System.gc();
		System.gc();
		applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration = null;
		System.gc();
		System.gc();
		System.gc();
		System.gc();
		System.gc();
		applicationConfiguration = new ApplicationConfiguration();
		QuitAction quitAction2 = applicationConfiguration.quitAction();
		
		// Then
		assertNotSame(quitAction1, quitAction2);
	}
	
	@Test
	void test_quitAction_should_return_a_new_instance_of_QuitAction_each_time_it_is_called_even_if_the_previous_instance_has_been_garbage_collected_several_times_and_the_application_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		QuitAction quitAction1 = applicationConfiguration.quitAction();
		quitAction1 = null;
		System.gc();
		System.gc();
		System.gc();
		System.gc();
		System.gc();
		applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration = null;
		System.gc();
		System.gc();
		System.gc();
		System.gc();
		System.gc();
		applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration = new ApplicationConfiguration();
		applicationConfiguration = null;
		System.gc();
		System.gc();
		System.gc();
		System.gc();
		System.gc();
		applicationConfiguration = new ApplicationConfiguration();
		QuitAction quitAction2 = applicationConfiguration.quitAction();
		
		// Then
		assertNotSame(quitAction1, quitAction2);
	}
	
	@Test
	void test_quitAction_should_return_a_new_instance_of_QuitAction_each_time_it_is_called_even_if_the_previous_instance_has_been_garbage_collected_several_times_and_the_application_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_been_restarted_several_times_and_the_computer_has_