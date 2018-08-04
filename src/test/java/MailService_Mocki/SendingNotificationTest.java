package MailService_Mocki;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import javax.management.Notification;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


@RunWith(MockitoJUnitRunner.class)
public class SendingNotificationTest {

    @Mock
    private EmailService emailService;
    @Mock
    private PigeonService pigeonService;

    @InjectMocks
    private SendingNotification notification;

    @Test
    public void shouldReturnEmailNotificationForAvailableEmailService() {
        when(emailService.isAvailable()).thenReturn(true);
        notification.sendNotification();
        verify(emailService).sendEmail("Email został wysłany");
    }

    @Test
    public void shouldReturnMessageNotificationForAvailableigeonService() {
        when(emailService.isAvailable()).thenReturn(false);
        when(pigeonService.isAvailable()).thenReturn(true);
        notification.sendNotification();
        verify(pigeonService).sendMessgae("Gołąd został wysłany");
    }

    @Test
    public void shouldReturnNothing() {
        when(emailService.isAvailable()).thenReturn(false);
        when(pigeonService.isAvailable()).thenReturn(false);
        notification.sendNotification();
    }
}