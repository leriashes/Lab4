public class Main 
{
     public static void main(String[] args) {

        //������ � ��������� ������ Publishing
        System.out.printf("\n\n\n\n������ �� ��������� ������ Publishing\n");

        Publishing publishing_1 = new Publishing();	//�������� ����� ����������� ��� ����������
        Publishing publishing_2 = new Publishing("������������ �2", "�. �������");		//�������� ����� ����������� � �����������

        //������ ��������� ��������
        System.out.printf("\n������ ������ ��������\npublishing_1 = ");
        publishing_1.Display();
        System.out.printf("\npublishing_2 = ");
        publishing_2.Display();
        System.out.printf("\n");

        //���� �������� ���� ����� �������
        System.out.printf("\n���� �������� ���� ����� �������\n");

        publishing_1.Read();
        System.out.printf("\npublishing_1 = ");
        publishing_1.Display();
        System.out.printf("\n\n");

        //������������� ��������
        System.out.printf("\n\n������������� ��������");
        publishing_1.Init("������", "�. ���������");
        System.out.printf("\npublishing_1 = ");
        publishing_1.Display();

        //�������� ��������� �� ������������ � �������� ������
        System.out.printf("\n\n�������� ��������� �� ������������ � �������� ������\n");
        publishing_1.Display();
        System.out.printf(" � �. ������");
        if (publishing_1.IsHere("�. ������"))
        {
            System.out.printf(": ��.\n");
        }
        else
        {
            System.out.printf(": ���.\n");
        }
    }
}